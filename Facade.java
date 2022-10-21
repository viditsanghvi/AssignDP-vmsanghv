import java.util.Scanner;

public class Facade {
	Scanner sc = new Scanner(System.in);

	private int UserType;


	private Product theSelectedProduct;


	private int nProductCategory;


	private ClassProductList theProductList;


	private Person thePerson;


	public boolean login() {
		Login logi = new Login();

			UserType = logi.login();
		if (UserType != -1) {
			createUser(new UserInfoItem());
			return true;
		} else {
			System.out.println("Wrong Credentials try again");
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
		 ReminderVisitor remind = new ReminderVisitor();
		 ClassProductList CL = new ClassProductList();
		 CL.accept(remind);
	}


	public void createUser(UserInfoItem userinfoitem) {
		if(UserType == 0){
			System.out.println("What do you want to buy? \n 1. Meat \n 2. Produce");
			int choice = Integer.parseInt(sc.nextLine());
			nProductCategory=choice;
			Buyer buyer = new Buyer(nProductCategory);
			buyer.CreateProductMenu();
			buyer.showMenu();


		}
		else{
			System.out.println("What do you want to Sell? \n 1. Meat \n 2. Produce");
			int choice = Integer.parseInt(sc.nextLine());
			nProductCategory=choice;
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
