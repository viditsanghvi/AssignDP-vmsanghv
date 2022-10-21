import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class MeatProductMenu extends ProductMenu {

	public void showMenu() {
		// This method is used to seperate meat and produce items

		File file = new File(
				"TextFiles/ProductInfo.txt");

		try {
			BufferedReader br
					= new BufferedReader(new FileReader(file));
			Scanner sc = new Scanner(file);
			String st;

			while (sc.hasNextLine()){
				st = sc.nextLine();
				String[] dict = st.split(":");
				if(dict[0].equals("Meat")){
					System.out.println(dict[1]);
				}

			}

		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}


	public void showAddButton() {

	}


	public void showViewButton() {

	}

	public void showRadioButton() {

	}


	public void showLabels() {

	}

	public void showComboxes() {

	}

}
