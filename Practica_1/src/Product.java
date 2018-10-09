
public class Product extends Category{

	float price;
	String NameProduct;
	
	protected Product(float Price,String nameproduct,String NC, String SC, String IC) {
		super(NC,SC,IC);
		price = Price;
		NameProduct = nameproduct;
		
	}
	
	public float getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
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
