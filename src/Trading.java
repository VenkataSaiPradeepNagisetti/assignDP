public class Trading {
    private final Facade facade;

    public Trading(Facade facade) {
        this.facade = facade;
    }

    private Product product;

    public void accept(NodeVisitor visitor) {

    }

}
