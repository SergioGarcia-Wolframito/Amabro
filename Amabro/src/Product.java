public class Product extends Category{

	float price;
	String NameProduct;
	
	protected Product(float Price,String nameproduct,String NC, String SC, String IC) {
		super(NC,SC,IC);
		price = Price;
		NameProduct = nameproduct;
		
	}
	
	
	public String getNameCategory() {
		return NameCategory;
	}

	public void setNameCategory(String namecategory) {
		this.NameCategory = namecategory;
	}
	
	public String getSubCategory() {
		return SubCategory;
	}

	public void setSubCategory(String subcategory) {
		this.SubCategory = subcategory;
	}
	public String getIdCategory() {
		return IdCategory;
	}

	public void setIdCategory(String idcategory) {
		this.IdCategory = idcategory;
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
	
	
	
	static double dolar(double x) {
		
		x = x * 1.15;
		
		return x;
	}
		
}