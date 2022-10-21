public abstract class Person {
    ProductMenu productMenu;
    ClassProductList productList = new ClassProductList();
    public abstract ProductMenu createProductMenu(int productCategory);
}
