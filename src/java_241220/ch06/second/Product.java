package java_241220.ch06.second;

public class Product<T,M> {

	private T Product;
	private M model;
	
	public T getProduct() {
		return Product;
	}
	
	public void setProduct(T product) {
		  Product = product;
	}
	
	public T getModel() {
		return Product;
	}
	
	public void setModel(M model) {
		  this.model = model;
	}
	
}
