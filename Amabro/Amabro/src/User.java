public class User {

	String name;
	String email;
	String password;
	
	protected User(String Name, String Email, String Password) {
		
		name = Name;
		email = Email;
		password = Password;
		
	}
	
	protected String getPassword() {
		return password;
	}

	protected void setPassword(String p_assword) {
		this.password = p_assword;
	}
	
	protected String getEmail() {
		return email;
	}

	protected void setEmail(String e_mail) {
		this.email = e_mail;
	}
	protected String getName() {
		return name;
	}

	protected void setName(String n_ame) {
		this.name = n_ame;
	}
	
	
	
}
