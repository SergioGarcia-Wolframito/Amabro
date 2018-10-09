import java.io.FileReader;
import java.util.Scanner;
import java.util.Properties;

public class Practica {
	
	static String usuario = "";
	static String mail = "";
	static String contra =  "";
	static String proof = "";
	
	static String product_n;
	static float product_pr;
	static String category_n;
	static String category_sub;
	static String category_id;
	
	void Product_1() {
		
		System.out.println("Welcome to the purchase menu.");
		System.out.println("");
		Scanner h1 = new Scanner(System.in);
		System.out.println("Introduce the product name.");
		product_n = h1.nextLine();
		Scanner h2 = new Scanner(System.in);
		System.out.println("Introduce the product price. ");
		product_pr = h2.nextFloat();
		Scanner h3 = new Scanner(System.in);
		System.out.println("Introduce the category name.");
		category_n = h3.nextLine();
		Scanner h4 = new Scanner(System.in);
		System.out.println("Introduce the sub-category name.");
		category_sub = h4.nextLine();
		Scanner h5 = new Scanner(System.in);
		System.out.println("Introduce the ID category.");
		category_id = h5.nextLine();
		
		Product product = new Product(product_pr, product_n, category_n, category_sub, category_id);
	
	}
	
	
	void start() {
		
		
		
		boolean passwor = false;	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the manage of Amabro.");
		System.out.println("To create an user is necessary to introduce an e-mail, an user name and a password.");
		System.out.println("");
		System.out.println("Introduce an email:");
		mail = sc.nextLine();
		Scanner sd = new Scanner(System.in);
		System.out.println("Introduce an user name:");
		usuario = sd.nextLine();
		Scanner se = new Scanner(System.in);
		
		while(!passwor) {
		
		System.out.println("Introduce a password: ");
		contra = se.nextLine();
		Scanner st = new Scanner(System.in);
		System.out.println("Introduce the password again: ");
		proof = st.nextLine();
		
		if(contra.equals(proof)) {
			passwor = true;
			User Usuario = new User(usuario, mail, contra);
			break;
		}
		
		}
		
	}
	
	void menu() {
		
		int number_menu = 0;
		
		Practica pr = new Practica();

		String n_user;
		String ma_il;
		String contri;
		
		User user1 = new User(usuario, mail, contra);
		
		while(number_menu != 7) {
			
			Scanner nm = new Scanner(System.in);
			System.out.println("");
			System.out.println("Welcome to the menu of Amabro. ");
			System.out.println("");
			System.out.println("1. Account settings. ");
			System.out.println("2. Account info.");
			System.out.println("3. Go to the purchase menu.");
			System.out.println("Introduce the number 7 to go back . ");
			
			System.out.println("Introduce the number of the option. ");
			number_menu = nm.nextInt();
			
			
		switch(number_menu) {
		
		case 1:
		
		{
			
			int settings = 0;
			Scanner nj = new Scanner(System.in);
			
			
			System.out.println("Account settings ");
			System.out.println("1. Change user name.");
			System.out.println("2. Change email.");
			System.out.println("3. Change password.");
			System.out.println("Introduce any other key to go back. ");
			settings = nj.nextInt();
			
			switch(settings) {
			
			case 1 :
				
				Scanner sf = new Scanner(System.in);
				System.out.println("Introduce the new user name: ");
				n_user = sf.nextLine();
				user1.setName(n_user);
				break;
				
			case 2 :
				
				Scanner sh = new Scanner(System.in);
				System.out.println("Introduce the new email");
				ma_il = sh.nextLine();
				user1.setEmail(ma_il);
				break;
				
			case 3 : 
			
				Scanner sj = new Scanner(System.in);
				System.out.println("Introduce the new password");
				contri = sj.nextLine();
				user1.setPassword(contri);
				break;
				
				
			default : 	
				
				System.out.println("Exit.");
				break;
			}
		}
		
		break;
		
		case 2: 
			
		{
			 
			System.out.println("Welcome to the Account info."); 
			System.out.println(""); 
			System.out.println("User name of the account: " + user1.getName());
			System.out.println("");
			System.out.println("Email of the account: " + user1.getEmail());
			
		}
				
			break;
		
		case 3:
			
			pr.Product_1();
			
			
			break;
			
			
		default:
			
			System.out.println("Exit: ");
			
			break;
		
			}

		}
		
	}

	public static void main(String[] args) {
		
		try(FileReader reader =  new FileReader("config1//config")) {
	        Properties properties = new Properties();
	        properties.load(reader);
	       
	        String email = properties.getProperty("email");
	        String username = properties.getProperty("username");
	        String password = properties.getProperty("password");
	        
	        /*
	        
	        System.out.println(email);
	        System.out.println(username);
	        System.out.println(password);
	        
	        */
	        
	       }catch (Exception e) {;
	       
	       e.printStackTrace();
	       
	       }
		
		
		/*Product producto = new Product(0, "Jony", null, null, null);
		System.out.println(producto.getNameProduct());
		*/
		
		/*producto.setNameProduct("Hola");
		System.out.println(producto.getNameProduct());
		*/
		
		Practica pract = new Practica();
		pract.start();
		System.out.println("");
		pract.menu();
		
		//System.out.println(producto.dolar(15));
		
		
	}

}
