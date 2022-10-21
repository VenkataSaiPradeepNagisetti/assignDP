import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReminderVisitor extends NodeVisitor {

    private Reminder reminder;

    private ClassProductList productList;

    public void visitProduct(Product product) {
    }

    /*
     * Visitor Pattern Implemented  to show trading
     * */
    public void visitTrading(Trading trading, String s) throws IOException {
        File f = new File("./src/UserProducts.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));
        String l;
        while ((l = br.readLine()) != null) {
            String[] strings = l.split(":");
            if (strings[0].equals(s)) {
                System.out.println(strings[1]);
            }
        }
    }


    public void visitFacade(Facade facade) {
    }

}
