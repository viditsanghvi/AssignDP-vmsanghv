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
		UserType=logi.login();
		createUser(new UserInfoItem());
return false;

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

	}


	public void createUser(UserInfoItem userinfoitem) {
		if(UserType == 0){
			System.out.println("What do you want to buy? \n 1. Meat \n 2. Produce");
			int choice = Integer.parseInt(sc.nextLine());
			nProductCategory=choice;
			Buyer buyer = new Buyer(nProductCategory);
			buyer.CreateProductMenu();
			buyer.showMenu();
//			if (choice == 1){
//				Buyer buyer = new Buyer(new MeatProductMenu(),);
//				buyer.showMenu();
//			} else if (choice ==2){
//				Buyer buyer = new Buyer(new ProduceProductMenu());
//			}else{
//				System.out.println("Invalid choice!! try again");
//			}

		}
		else{
			System.out.println("What do you want to Sell? \n 1. Meat \n 2. Produce");
			int choice = Integer.parseInt(sc.nextLine());
			nProductCategory=choice;
			Seller seller = new Seller(nProductCategory);
			seller.CreateProductMenu();
			seller.showMenu();

//			if (choice == 1){
//				Seller seller = new Seller(new MeatProductMenu());
//			} else if (choice ==2){
//				Seller seller = new Seller(new ProduceProductMenu());
//			}else{
//				System.out.println("Invalid choice!! try again");
//			}
		}
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
