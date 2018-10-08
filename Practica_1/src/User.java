
public class User {

	protected String name = "";
	protected String email = "";
	protected String password = "";
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	protected User(String Name, String Email, String Password) {
		
		name = Name;
		email = Email;
		password = Password;
		
	}
	
}
