import java.io.File;
import java.util.Scanner;

public class ReminderVisitor extends NodeVisitor {

	private Reminder m_Reminder;

	public void visitProduct(Product product) {
		System.out.println("Item trading " + product.getName() + " " + product.getTrading());
	}

	public void visitTrading(Trading trading) {
	}

	public void visitFacade(Facade facade) {


	}
}