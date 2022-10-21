public class MeatProductMenu implements ProductMenu {


    /*
     * Iterator Pattern Implemented  to show menu
     * */
    public void showMenu(Facade facade) {
        System.out.println("\n==========================Iterator Pattern======================\n");
        while(facade.theProductList.getIterator().hasNext()){
            Product nextProduct = facade.theProductList.getIterator().next();
            String[] split = nextProduct.item.split(":");
            String p = split[0];
            if (p.equals("Meat"))
                System.out.println("Meat Product Items : " + split[1]);
        }
        facade.theProductList.getIterator().moveToHead();
    }

    public void showViewButton() {

    }

    public void showAddButton() {

    }

    public void showRadioButton() {

    }

    public void showLabels() {

    }

    public void showComboxes() {

    }

}
