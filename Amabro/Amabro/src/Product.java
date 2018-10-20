public class Product extends Category{

	float price;
	String NameProduct;
	
	protected Product(float Price,String nameproduct,String NC, String SC, String IC) {
		super(NC,SC,IC);
		price = Price;
		NameProduct = nameproduct;
		
	}
	
	
	static double dolar(double x) {
		
		x = x * 1.15;
		
		return x;
	}
		
}