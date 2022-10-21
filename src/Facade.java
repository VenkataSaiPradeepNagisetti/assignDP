import java.io.IOException;
import java.util.Scanner;

public class Facade {

    private int UserType;

    private Product theSelectedProduct;

    private int nProductCategory;

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

    public void productOperation() {
        while (true) {
            System.out.println("Select type of item - 0 : Meat 1 : Produce");
            Scanner scanner = new Scanner(System.in);
            int typeOfProductSelected = scanner.nextInt();
            if (typeOfProductSelected > 1 || typeOfProductSelected < 0) {
                System.out.println("please enter a valid number");
            } else {
                nProductCategory = typeOfProductSelected;
                System.out.println(nProductCategory);
                thePerson.createProductMenu(nProductCategory).showMenu(this);
            }
        }
    }

    public void login() {
        Login cred = new Login();
        if (cred.login()) {
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
        } else {
            login();
        }
    }


    ClassProductList theProductList = new ClassProductList();
}
