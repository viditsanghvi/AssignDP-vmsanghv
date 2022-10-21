public class Trading {

	private Product product;

	private OfferingList offeringList;

	public void accept(NodeVisitor visitor)
		{
			// Visitor pattern is being used in this method
			visitor.visitTrading(offeringList.trading);
		}


}
