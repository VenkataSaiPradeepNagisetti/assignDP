public class Buyer extends Person {

	public void showMenu() {}

	/*
	 * Factory Pattern Implemented  to create product menu
	 * */

	@Override
	public ProductMenu createProductMenu(int theLevel) {
		if (theLevel == 0) {
			this.productMenu = new MeatProductMenu();
		} else {
			this.productMenu = new ProduceProductMenu();
		}
		return this.productMenu;
	}

}
