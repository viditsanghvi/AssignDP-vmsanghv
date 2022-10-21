import javax.swing.plaf.metal.MetalLookAndFeel;
import java.util.Objects;

// This used bridge pattern


public class Buyer extends Person {
	private int productCategory;

	Buyer(int productCategory) {
		this.productCategory = productCategory;
	}

	public void showMenu() {
		theProductMenu.showMenu();


	}



	public ProductMenu CreateProductMenu() {
		if(productCategory == 1){
			this.theProductMenu = new MeatProductMenu();
			return this.theProductMenu;
		} else{
			this.theProductMenu = new ProduceProductMenu();
			return this.theProductMenu;

		}
	}

}
