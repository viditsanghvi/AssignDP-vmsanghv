import java.util.Scanner;

public class Facade {
	Scanner sc = new Scanner(System.in);

	private int UserType;


	private Product theSelectedProduct;


	private int nProductCategory;


	private ClassProductList theProductList;


	private Person thePerson;

// Have implented facade pattern here. This contains all the subsystems in the project and calls every function


	public boolean login() {
		Login logi = new Login();

			UserType = logi.login();
		if (UserType != -1) {
			System.out.println();
			System.out.println("Using Factor pattern to use object");
			System.out.println();
			createUser(new UserInfoItem());
			return true;
		} else {
			System.out.println("Wrong Credentials please try again");
			return false;

		}
	}

	public void addTrading() {

	}


	public void viewTrading() {

	}


	public void decideBidding() {

	}


	public void discussBidding() {

	}


	public void submitBidding() {

	}

	 void remind() {

		 System.out.println();
		 ReminderVisitor remind = new ReminderVisitor();
		 ClassProductList CL = new ClassProductList();

		 CL.accept(remind);
	}


	public void createUser(UserInfoItem userinfoitem) {
		if(UserType == 0){
			System.out.println("Hello, what do you want to buy today? \n 1. Produce \n 2. Meat");
			int choice = Integer.parseInt(sc.nextLine());
			nProductCategory=choice;
			System.out.println("Calling visitor pattern to list products");
			Buyer buyer = new Buyer(nProductCategory);
			buyer.CreateProductMenu();
			buyer.showMenu();
			remind();



		}
		else{
			System.out.println("Hello, What are you looking to sell today? \n 1. Produce \n 2. Meat");
			int choice = Integer.parseInt(sc.nextLine());
			nProductCategory=choice;
			System.out.println("Calling visitor pattern to list products");
			Seller seller = new Seller(nProductCategory);
			seller.CreateProductMenu();
			seller.showMenu();
			remind();

		}
	}

	public Product getProduct(){
		return theSelectedProduct;
	}
	public void createProductList() {

	}


	public void attachProductToUser() {

	}


	public Product SelectProduct() {
		return null;
	}


	public void productOperation() {

	}

}
