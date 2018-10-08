
public class Books extends Product{

	protected Books(int Price, String nameproduct) {
		super(Price, nameproduct);
		// TODO Auto-generated constructor stub
	}
	String BookWritter = "";

	
	public String getBookWritter() {
			
		return BookWritter;
	}
	public void setBookWritter(String BWritter) {
		
		this.BookWritter = BWritter;	
	}
	

}
