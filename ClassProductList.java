import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassProductList extends ArrayList {

	private ProductIterator productIterator;

	private ReminderVisitor reminderVisitor;

	private List<Product> products;


	public ClassProductList() {
		products = new ArrayList<>();
		File file = new File(
				"TextFiles/ProductInfo.txt");

		try {

			Scanner sc = new Scanner(file);
			String temp;

			while (sc.hasNextLine()){
				temp = sc.nextLine();
				String[] tempstr = temp.split(":");
				products.add(new Product(tempstr[1], tempstr[0]));
			}

			}


		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void accept(NodeVisitor visitor) {

//	We are using iterator and vistor pattern in this method


		ProductIterator itr = new ProductIterator(products);
		System.out.println("Iterator is used to add the below elements in the list");
		System.out.println();
		System.out.println("The below list shows the available items");
		while (itr.hasNext()) {
			Product product = itr.Next();
			visitor.visitProduct(product);
		}
	}


}
