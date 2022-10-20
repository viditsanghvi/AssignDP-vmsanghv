import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class ProduceProductMenu extends ProductMenu {

	public void showMenu() {
		File file = new File(
				"TextFiles/ProductInfo.txt");

		try {
			Scanner sc = new Scanner(file);
			String st;

			while (sc.hasNextLine()){
				st = sc.nextLine();
				String[] dict = st.split(":");
				if(dict[0].equals("Produce")){
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


	public void showRadioButton() {

	}


	public void showLabels() {

	}


	public void showViewButton() {

	}

	public void showComboxes() {

	}

}
