import java.io.FileReader;
import java.util.Scanner;
import java.util.Properties;





public class Practica {
	
	
	static String usuario;
	static String mail;
	static String contra;
	
	// Void Inicio se piden datos al usuario.
	void inicio() {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bienvenido a la gestion de productos de la tienda.");
		System.out.println("Para crear un usuario es necesario introducir Nombre, E-mail y contraseña.");
		
		System.out.println("Introduce tu correo electronico");
		mail = sc.nextLine();
		Scanner sd = new Scanner(System.in);
		System.out.println("Introduce un nombre de usuario");
		usuario = sd.nextLine();
		Scanner se = new Scanner(System.in);
		System.out.println("Introduce una contraseña");
		contra = se.nextLine();
		User Usuario = new User(usuario, mail, contra);
		
	}
	// En el menu se encuentra la opcion ajustes de usuario.
	void menu() {
		
		int numero_menu = 0;
		while(numero_menu != 7) {
			
			Scanner nm = new Scanner(System.in);
			System.out.println("1 .Ajustes de la cuenta: ");
			
			System.out.println("Introduce el 7 para salir : ");
			
			System.out.println("Introduce el numero de la opcion a la que quieras acceder: ");
			numero_menu = nm.nextInt();
			
		switch(numero_menu) {
		
		
		
		case 1:
		
		
		{
			
			int ajustes_cuenta = 0;
			
			User user1 = new User(usuario, mail, contra);
			
			System.out.println("Ajustes de la cuenta: ");
			System.out.println("1. Cambiar nombre de usuario.");
			System.out.println("2. Cambiar correo electronico de usuario.");
			System.out.println("3. Cambiar contraseña de usuario.");
			System.out.println("Pulse cualquier otra tecla para salir. ");
			
			switch(ajustes_cuenta) {
			
			case 1 :
				Scanner sf = new Scanner(System.in);
				
				String n_user = "";
				System.out.println("Introcude el nuevo nombre de usuario: ");
				n_user = sf.nextLine();
				user1.setName(n_user);
				
				break;
				
			case 2 :
				Scanner sh = new Scanner(System.in);
				String correo = "";
				System.out.println("Introduce el nuevo corrreo electronico del usuario");
				correo = sh.nextLine();
				user1.setEmail(correo);
				
				break;
				
			case 3 : 
			
				Scanner sj = new Scanner(System.in);
				String contri = "";
				System.out.println("Introduce la nueva contrase"+"\u00f1a"+" del usuario");
				correo = sj.nextLine();
				user1.setPassword(contri);
				
				
				break;
				
				
			default : 	
				
				System.out.println("Saliendo del menu de ajustes.");
				
				break;
			}
		}
		
		break;
		
		
		
		case 2: 
			
			
			break;
		
		default:
			
			break;
		
			}
		
		}
		
		
		System.out.println("Saliendo del menu: ");
		
		
	}

	public static void main(String[] args) {
		
		
		
		try(FileReader reader =  new FileReader("config")) {
	        Properties properties = new Properties();
	        properties.load(reader);
	       
	        String email = properties.getProperty("email");
	        String username = properties.getProperty("username");
	        String password = properties.getProperty("password");
	        
	        /*System.out.println(email);
	        System.out.println(username);
	        System.out.println(password);
	        */
	        
	       }catch (Exception e) {;
	       
	       e.printStackTrace();
	       
	       }
		
		
		Product producto = new Product(0, "Jony");
		/*System.out.println(producto.getNombreProducto());
		
		producto.setNombreProducto("Hola");
		System.out.println(producto.getNombreProducto());
		*/
		Practica pract = new Practica();
		pract.inicio();
		pract.menu();
		
		//System.out.println(producto.dolar(15));
		
		
	}

}
