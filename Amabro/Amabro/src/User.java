public class User implements ProxyInterface{

	static private String name;
	static private String email;
	static private String password;
	
	
	
	@Override
	public String getMainName() {
		
		return name;
	}
	@Override
	public String getMainEmail() {
		
		return email;
	}
	@Override
	public String getMainPassword() {
		
		return password;
	}
	@Override
	public void setMainName(String name) {
		
		this.name = name;
		
	}
	@Override
	public void setMainEmail(String email) {
		
		this.email = email;
		
	}
	@Override
	public void setMainPassword(String password) {
		
		this.password = password;
		
	}
}
