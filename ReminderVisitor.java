import java.io.File;
import java.util.Scanner;

public class ReminderVisitor extends NodeVisitor {

	private Reminder m_Reminder;

	public void visitProduct(Product product) {
		File fileseller = new File(
				"TextFiles/UserProduct.txt");
		try {

			Scanner sc = new Scanner(fileseller);
			String temp;

			while (sc.hasNextLine()) {
				temp = sc.nextLine();
				String[] tempstr = temp.split(":");
//				products.add(new Product(tempstr[1], tempstr[0]));
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}


		System.out.println("Item trading " + product.getName() + " " + product.getTrading());
	}

	public void visitTrading(Trading trading) {
	}

	public void visitFacade(Facade facade) {


	}
}