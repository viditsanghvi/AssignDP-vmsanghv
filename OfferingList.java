import java.util.ArrayList;
import java.util.List;

public class OfferingList extends ArrayList {

	private OfferingIterator offeringIterator;
	private List<Offering> Listofofferings;
	public OfferingList() {
		Listofofferings = new ArrayList<>();
	}
	protected Trading trading;

	public ListIterator createIterator() {
		return new OfferingIterator(this.Listofofferings);
	}

}
