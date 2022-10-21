import java.util.List;

// Have implemented iterator pattern in this class


public class OfferingIterator implements ListIterator {

	private OfferingList offeringList;
	private List<Offering> Listofofferings;
	private int pos=0;

	public OfferingIterator(List<Offering> offerings)
	{
		this.Listofofferings = offerings;

	}
	@Override
	public boolean hasNext()
	{

		return pos < Listofofferings.size() && Listofofferings.get(pos) != null;
	}

	@Override
	public Offering Next() {

		Offering offering= Listofofferings.get(pos);
		pos += 1;
		return offering;
	}

	@Override
	public void MoveToHead() {
		pos=0;
	}

	@Override
	public void Remove() {

	}

}
