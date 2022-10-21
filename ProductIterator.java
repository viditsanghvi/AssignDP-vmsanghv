import java.util.List;

public class ProductIterator implements ListIterator {

	private ClassProductList classProductList;
	private List<Product> PList;

	public boolean hasNext() {
		return position < PList.size() && PList.get(position) != null;
	}
	private int position=0;
	public ProductIterator(List<Product> productList) {
		this.PList = productList;
	}

	public Product Next() {
		Product product = PList.get(position);
		position = position + 1;
		return product;
	}


	public void MoveToHead() {
		position=0;
	}


	public void Remove() {

	}

}
