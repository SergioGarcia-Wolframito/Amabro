public class User {

	String name;
	String email;
	String password;
	
	protected User(String Name, String Email, String Password) {
		
		name = Name;
		email = Email;
		password = Password;
		
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String p_assword) {
		this.password = p_assword;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String e_mail) {
		this.email = e_mail;
	}
	public String getName() {
		return name;
	}

	public void setName(String n_ame) {
		this.name = n_ame;
	}
	
	
	
}
