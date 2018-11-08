public class User {

	static private String name;
	static private String email;
	static private String password;
	
	protected User(String Name, String Email, String Password) {
		
		name = Name;
		email = Email;
		password = Password;
		
	}
	static protected String getPassword() {
		return password;
	}
	static protected void setPassword(String p_assword) {
		password = p_assword;
	}
	static protected String getEmail() {
		return email;
	}
	static protected void setEmail(String e_mail) {
		email = e_mail;
	}
	static protected String getName() {
		return name;
	}
	static protected void setName(String n_ame) {
		name = n_ame;
	}
}
