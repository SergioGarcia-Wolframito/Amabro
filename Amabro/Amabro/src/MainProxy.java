
public class MainProxy implements ProxyInterface{

	User main = new User();

	@Override
	public String getMainName() {
		
		return main.getMainName();
	}

	@Override
	public String getMainEmail() {
		
		return  main.getMainEmail();
	}

	@Override
	public String getMainPassword() {
		
		return  main.getMainPassword();
	}

	@Override
	public void setMainName(String name) {
		
		main.setMainName(name);
	}

	@Override
	public void setMainEmail(String email) {
		
		main.setMainEmail(email);
		
	}

	@Override
	public void setMainPassword(String password) {
		
		main.setMainPassword(password);
	}

}
