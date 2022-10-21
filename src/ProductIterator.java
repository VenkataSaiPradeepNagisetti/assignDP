public class ProductIterator implements ListIterator {

    private final ClassProductList classProductList;
    private int index;

    public ProductIterator(ClassProductList classProductList) {
        this.classProductList = classProductList;
        this.index = 0;
    }

    public boolean hasNext() {
        boolean result = false;
        return this.index < classProductList.size();
    }

    public Product next() {
        Product p = null;
        if (this.hasNext()) {
            p = classProductList.get(index);
        }
        index++;
        return p;
    }

    public void moveToHead() {

    }

    public void remove() {
        classProductList.remove(index);
        index--;
    }

}
