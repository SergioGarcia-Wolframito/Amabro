
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
	

}
