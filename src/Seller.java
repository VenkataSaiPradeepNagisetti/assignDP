public class Seller extends Person {

	public void showMenu() {
		for(Product iterator: productList)
			if(!(iterator.productList.size() ==0))
				System.out.println( iterator.productList);
		System.out.println("********* Bridge Pattern ******** created menu for Seller");
	}

	@Override
	public ProductMenu createProductMenu(int flag) {
		System.out.println("=======================Factory Pattern================================\n");
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
