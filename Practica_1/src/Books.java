
public class Books extends Product{

	
	
	protected String BookWritter = "";
	protected String Brand = "";
	protected int Page_Number = 0;
	protected String ISBN = "";
	
	protected Books(float Price,String nameproduct,String NC, String SC, String IC, String BW, String B, int PN, String isbn) {
		
		super(Price, nameproduct, "", "", "");
		BookWritter = BW;
		Brand = B;
		Page_Number = PN;
		ISBN = isbn;
		
		// TODO Auto-generated constructor stub
	}
	
	public String getBookWritter() {
		
		return BookWritter;
	}
	
	public void setBookWritter(String BWritter) {
		
		this.BookWritter = BWritter;	
	}
	
	public String getBookBrand() {
		
		return Brand;
	}
	
	public void setBookBrand(String brand) {
		
		this.Brand = brand;	
	}
	
	public int getBookPages() {
		
		
		return Page_Number;
		
	}

	public void setBookPage(int page) {
		
		
		this.Page_Number = page;
		
	}
	
	public String getISBN() {
		
		return ISBN;
	}
	
	public void setISBN(String is_bn) {
		
		this.ISBN = is_bn;	
	}
	
	
	
	public float getPrice() {
		return price;
	}
	

	public void setPrice(float pr_pri_ce) {
		this.price = pr_pri_ce;
	}

	public String getNameProduct() {
		return NameProduct;
	}

	public void setNameProduct(String nameproduct) {
		NameProduct = nameproduct;
	}
	
	
	double dolar1(double x) {
		
		x = x * 1.15;
		
		return x;
	}
	

}
