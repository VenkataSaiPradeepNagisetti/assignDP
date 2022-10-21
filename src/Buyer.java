public class Buyer extends Person {

	public void showMenu() {
		for(Product iterator: productList)
			if(!(iterator.productList.size() ==0))
				System.out.println( iterator.productList);
	}

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
