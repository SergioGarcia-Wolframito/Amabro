public class Product extends Category{

	protected float price;
	protected String NameProduct;
	protected boolean stock;
	protected boolean compra;
	
	protected Product(float Price,String nameproduct,String NC, String SC, String IC, boolean sto,boolean comp) {
		super(NC,SC,IC);
		price = Price;
		NameProduct = nameproduct;
		stock = sto;
		compra = comp;
	}
	protected float getPrice() {
		return price;
	}
	protected String getNameProduct() {
		return NameProduct;
	}
	protected boolean getStock() {
		return stock;
	}
	protected boolean getCompra() {	
		return compra;
	}
	void setCompra(boolean compr) {
		compra = compr;
	}
	static double dolar(double x) {	
		x = x * 1.15;
		return x;
	}
		
}