public class Product extends Category{

	protected float price;
	protected String NameProduct;
	protected boolean stock;
	protected boolean compra;
	protected int cantidadcomprados;
	protected int cantidad;
	
	
	protected Product(float Price,String nameproduct,String NC, String SC, String IC, boolean sto,boolean comp,int c,int cc) {
		
		super(NC,SC,IC);
		price = Price;
		NameProduct = nameproduct;
		stock = sto;
		compra = comp;
		cantidadcomprados = cc;
		cantidad = c;
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
	
	protected int getCantidadcomprados() {
		return cantidadcomprados;
	}
	protected void setCantidadcomprados(int cantidadcomprados) {
		this.cantidadcomprados = cantidadcomprados;
	}
	protected int getCantidad() {
		return cantidad;
	}
	protected void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	static double dolar(double x) {	
		x = x * 1.15;
		return x;
	}
		
}