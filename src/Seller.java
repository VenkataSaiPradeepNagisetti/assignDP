public class Seller extends Person {

	public void showMenu() {}

	@Override
	public ProductMenu createProductMenu(int flag) {
		if (flag == 0) {
			this.productMenu = new MeatProductMenu();
		} else {
			this.productMenu = new ProduceProductMenu();
		}
		return productMenu;
	}


	public ProductMenu createProductMenu(Product search, int nProductCategory) {
		return null;
	}

}
