import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Login {
    public Login() {
    }

    public boolean login() {
        Scanner s = new Scanner(System.in);
        System.out.println("Choose the UserType: \n 0: For Buyer \n 1: For Seller");
        int userType = s.nextInt();
        s.nextLine();
        File file;
        if (userType == 0) {
            file = new File("./src/BuyerInfo.txt");
        } else {
            if (userType != 1) {
                System.out.print("Enter valid credentials and try again");
                System.exit(1);
                return false;
            }

            file = new File("./src/SellerInfo.txt");
        }

        System.out.println("Please enter your username:");
        String user = s.nextLine();
        System.out.println("Enter your password:");
        String pswd = s.nextLine();

        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException var10) {
            throw new RuntimeException(var10);
        }

        Map<String, String> users = new HashMap<>();

        while(true) {
            String lineString;
            try {
                if ((lineString = br.readLine()) == null) {
                    break;
                }
            } catch (IOException var11) {
                throw new RuntimeException(var11);
            }

            String[] strings = lineString.split(":");
            users.put(strings[0], strings[1]);
        }

        if (users.containsKey(user) && ((String)users.get(user)).equals(pswd)) {
            System.out.println("Successfully logged in");
            return true;
        } else {
            System.out.print("Enter valid credentials and try again");
            System.exit(1);
            return false;
        }
    }
}
