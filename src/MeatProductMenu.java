public class MeatProductMenu implements ProductMenu {

    public void showMenu(Facade facade) {
        System.out.println("\n==========================Iterator Pattern======================\n");
        while(facade.theProductList.getIterator().hasNext()){
            String[] split = facade.theProductList.getIterator().next().item.split(":");
            if (split[0].equals("Meat"))
                System.out.println("Meat Product Items : " + split[1]);
        }
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
