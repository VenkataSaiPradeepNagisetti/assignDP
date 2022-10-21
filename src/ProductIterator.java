public class ProductIterator implements ListIterator {

    private final ClassProductList classProductList;
    private int ind;

    public ProductIterator(ClassProductList classProductList) {
        this.classProductList = classProductList;
        this.ind = 0;
    }


    public boolean hasNext() {
        boolean result = false;
        return this.ind < classProductList.size();
    }

    public Product next() {
        Product p = null;
        if (this.hasNext()) {
            p = classProductList.get(ind);
        }
        ind++;
        return p;
    }

    public void moveToHead() {
        this.ind = 0;
    }

    public void remove() {
        classProductList.remove(ind);
        ind--;
    }

}
