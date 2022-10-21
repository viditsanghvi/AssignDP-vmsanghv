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
		ProductIterator iterator = new ProductIterator(products);
		System.out.println("Using iterator pattern to access elements in product list");
		System.out.println();
		System.out.println();
		while (iterator.hasNext()) {
			Product product = iterator.Next();
			visitor.visitProduct(product);
		}
	}


}
