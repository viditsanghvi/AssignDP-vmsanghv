
public class Seller extends Person {
	private int productCategory;

	Seller(int productCategory) {
		this.productCategory = productCategory;
	}

	public void showMenu() {
		theProductMenu.showMenu();
	}


	public ProductMenu CreateProductMenu() {
		// Here I have implemeted bridge pattern
		if(productCategory == 1){
			this.theProductMenu = new ProduceProductMenu();
			return this.theProductMenu;
		} else{
			this.theProductMenu = new MeatProductMenu();
			return this.theProductMenu;

		}
	}

}
