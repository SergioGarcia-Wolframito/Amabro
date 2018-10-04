
public class Product {

	int price;
	String NombreProducto;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	protected Product(int Price,String nombreproducto) {
		
		price = Price;
		NombreProducto = nombreproducto;
		
	}

	public String getNombreProducto() {
		return NombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		NombreProducto = nombreProducto;
	}
		
}
