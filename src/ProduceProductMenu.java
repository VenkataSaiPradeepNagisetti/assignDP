public class ProduceProductMenu implements ProductMenu {


    public void showMenu(Facade facade) {
        System.out.println("\n=========================Iterator Pattern==========================\n");
        while (facade.theProductList.getIterator().hasNext()) {
            String[] split = facade.theProductList.getIterator().next().item.split(":");
            if (split[0].equals("Produce"))
                System.out.println("Produce Product Items: " + split[1]);
        }
    }

    public void showAddButton() {

    }

    public void showViewButton() {

    }

    public void showRadioButton() {

    }

    public void showLabels() {

    }

    public void showComboxes() {

    }

}
