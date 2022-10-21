import java.io.IOException;
import java.util.Scanner;

public class Facade {

    private int UserType;
    String myUser;

    private Product theSelectedProduct;

    private int productCategory;

    private Person thePerson;

    public void addTrading() {

    }

    public void viewTrading() {

    }

    public void decideBidding() {

    }

    public void discussBidding() {

    }

    public void submitBidding() {

    }

    public void remind() {

    }

    public void createUser(UserInfoItem userinfoitem) {

    }

    public void createProductList() {

    }

    public void AttachProductToUser() {

    }

    public Product SelectProduct() {
        return null;
    }

    /*
     * Console Log Implemented  to show menu
     * */
    public void productOperation() {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nSelect " +
                    "\n1- View Menu  " +
                    "\n2- View Trading " +
                    "\n3- Signout");

            int input = scanner.nextInt();
            if (input == 1) {
                System.out.println("\n==========================Factory Pattern======================\n");
                System.out.println("Select type of item - 0 : Meat 1 : Produce");
                int typeOfProductSelected = scanner.nextInt();
                if (typeOfProductSelected > 1 || typeOfProductSelected < 0) {
                    System.out.println("please enter a valid number");
                } else {
                    productCategory = typeOfProductSelected;
                    System.out.println(productCategory);
                    thePerson.createProductMenu(productCategory).showMenu(this);
                }
            } else if (input == 2) {
                try {
                    System.out.println("\n==========================Visitor Pattern======================\n");
                    Trading trading = new Trading(this);
                    ReminderVisitor reminderVisitor = new ReminderVisitor();
                    reminderVisitor.visitTrading(trading, this.myUser);
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
            } else if (input == 3) {
                System.exit(1);
            }
        }
    }

    public void login() {
        Login cred = new Login();
        if (cred.login()) {
            System.out.println("\n==========================Bridge Pattern======================\n");
            try {
                theProductList.initAllProducts("./src/Products.txt");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            if (cred.userType == 0) {
                thePerson = new Buyer();
            } else if (cred.userType == 1) {
                thePerson = new Seller();
            }
            this.myUser = cred.currUser;
        } else {
            login();
        }
    }


    ClassProductList theProductList = new ClassProductList();
}
