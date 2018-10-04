import java.io.FileReader;
import java.util.Properties;

public class Practica {

	public static void main(String[] args) {
		
		try(FileReader reader =  new FileReader("config")) {
	        Properties properties = new Properties();
	        properties.load(reader);
	       
	        String email = properties.getProperty("email");
	        String username = properties.getProperty("username");
	        String password = properties.getProperty("password");
	        
	        System.out.println(email);
	        System.out.println(username);
	        System.out.println(password);
	        
	       }catch (Exception e) {;
	       
	       e.printStackTrace();
	       
	       }
		
		
		Product producto = new Product(0, "Jony");
		System.out.println(producto.getNombreProducto());
		
		
	}

}
