import java.util.ArrayList;
import java.util.List;

public class Product {

    String item;

    List<Product> productList = new ArrayList<>();

    public Product(String s) {
        this.item = s;
    }
}
