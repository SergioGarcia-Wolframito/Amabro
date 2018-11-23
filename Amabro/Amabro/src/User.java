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
	@SuppressWarnings("static-access")
	@Override
	public void setMainName(String name) {
		
		this.name = name;
		
	}
	@SuppressWarnings("static-access")
	@Override
	public void setMainEmail(String email) {
		
		this.email = email;
		
	}
	@SuppressWarnings("static-access")
	@Override
	public void setMainPassword(String password) {
		
		this.password = password;
		
	}
}
