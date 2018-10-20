public class Product extends Category{

	float price;
	String NameProduct;
	
	boolean stock;
	
	protected Product(float Price,String nameproduct,String NC, String SC, String IC, boolean sto) {
		super(NC,SC,IC);
		price = Price;
		NameProduct = nameproduct;
		stock = sto;
		
	}
	
	
	static double dolar(double x) {
		
		x = x * 1.15;
		
		return x;
	}
	
	
	
	
		
}