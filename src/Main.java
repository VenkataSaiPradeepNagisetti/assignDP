public class Main {
    /*
    * Facade Pattern Implemented in login functionality by facade object
    * */
    public static void main(String[] args) {
        System.out.println("\n==========================Facade Pattern======================\n");
        Facade facade = new Facade();
        facade.login();
        facade.productOperation();
    }
}