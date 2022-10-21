import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ClassProductList extends ArrayList<Product> {

    private ProductIterator productIterator;
    public ProductIterator getIterator() {
        return this.productIterator;
    }
    public ClassProductList() {
        this.productIterator = new ProductIterator(this);
    }
    public void initAllProducts(String inputPath) throws IOException {
        File f = new File(inputPath);
        BufferedReader b = new BufferedReader(new FileReader(f));
        String s;
        while ((s = b.readLine()) != null) {
            this.add(new Product(s));
        }
    }
}
