
public class Product {

	int price;
	String NameProduct;
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	protected Product(int Price,String nameproduct) {
		
		price = Price;
		NameProduct = nameproduct;
		
	}

	public String getNameProduct() {
		return NameProduct;
	}

	public void setNameProduct(String nameproduct) {
		NameProduct = nameproduct;
	}
	
	double dolar(double x) {
		
		x = x + 1.15;
		
		return x;
	}
		
}
