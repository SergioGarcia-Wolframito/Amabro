import java.util.List;
import java.io.FileReader;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Properties;
public class Main {

	static Main pract = new Main();
	
	static String mal,na,pass;
	static String mail = "",usuario = "",contra = "";
	
	static List <Category> list1Category = new ArrayList <Category>();
	
    
    
    void Administrator() {
    	
    	
    	Scanner am = new Scanner(System.in);

    	int Admin_menu = 0;
    	
    	while(Admin_menu!=3) {
    	
    	System.out.println("Welcome to the admin menu.");
    	System.out.println("1. Manage products");
    	System.out.println("2. Manage category");
    	System.out.println("3. Exit");  
    	
    	Admin_menu = am.nextInt();
    	
    	if(Admin_menu == 1) {
    		
    		
    		
    		
    	}
    	
    	if(Admin_menu==2) {
    		
    		Scanner az = new Scanner(System.in);
    		
    		int admin_menu_2 = 0;
    		
    		while(admin_menu_2 != 3) {
    			
    		System.out.println("Welcome to the manage category menu.");
    		System.out.println("1. View all the categories");
    		System.out.println("2. Add category");
    		System.out.println("3. Exit");
    		
    		admin_menu_2 = az.nextInt();
    		
    		if(admin_menu_2 == 2) {
    			
    			
    			Scanner fg = new Scanner(System.in);
    			Scanner fl = new Scanner(System.in);
    			Scanner fi = new Scanner(System.in);
    			
    			String name_category = "", sub_category = "", i_d = "";
    			
    			System.out.println("To create a new category introduce Category Name, Sub Category Name and Category ID");
    			System.out.println("");
    			System.out.println("Category name : ");
    			name_category = fg.nextLine();
    			System.out.println("Sub Category name : ");
    			sub_category = fl.nextLine();
    			System.out.println("Category ID : ");
    			i_d = fi.nextLine();
    			
    			if(name_category!="" && sub_category!="" && i_d!="") {
    			
    			list1Category.add(new Category(name_category, sub_category, i_d ));
    			
    			}
    			
    		}
    		
    		if(admin_menu_2 == 1) {
    			
    			   for (int i = 0; i <= list1Category.size() - 1; i++) {
            
    				   System.out.println(i+1 + "Category :"); 
      				   System.out.println("//Name Category:  " + list1Category.get(i).NameCategory + " //SubCategory:  "
      						   + list1Category.get(i).SubCategory + " //ID:  " + list1Category.get(i).IdCategory);
      				   
      				   System.out.println("");
      				   
        		}
	
    		}
    		
    		
    		
    		}
    		
    		
     }
    	
    else {
    		
    		
    		System.out.println("Goodbye");
    		
    		
    	}
    	
	
    	}
    	
        	
    }
    
    void start() {
		
		boolean passwor = false;	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Amabro.");
		System.out.println("To create an user is necessary to introduce an e-mail, an user name and a password.");
		System.out.println("");
		System.out.println("Introduce an email:");
		mail = sc.nextLine();
		Scanner sd = new Scanner(System.in);
		System.out.println("Introduce an user name:");
		usuario = sd.nextLine();
		Scanner se = new Scanner(System.in);
		
		String proof = "";
		
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
    
    void user_menu() {
		
    	User user1 = new User(usuario, mail, contra);
		
    	String n_user, ma_il, contri;
    	
    	int number_menu = 0;
    	
    	while(number_menu != 7) {
			
			Scanner nm = new Scanner(System.in);
			System.out.println("");
			System.out.println("Welcome to the Account menu of Amabro. ");
			System.out.println("");
			System.out.println("1. Account settings. ");
			System.out.println("2. Account info.");
			System.out.println("Introduce the number 7 to go back. ");
			System.out.println("");
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
		
		
		case 2: 
			
		{
			 
			System.out.println("Welcome to the Account info."); 
			System.out.println(""); 
			System.out.println("User name of the account: " + user1.getName());
			System.out.println("");
			System.out.println("Email of the account: " + user1.getEmail());
			
		}
				
			
    	
		}
		
		
    	}
		
	}
    
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(FileReader reader =  new FileReader("config")) {
			
	        Properties properties = new Properties();
	        properties.load(reader);
	        
	       
	       String email = properties.getProperty("email");
	       String username = properties.getProperty("username");
	       String password = properties.getProperty("password");
	        
	        mal = email;
	        na = username;
	        pass = password;
	        
	       /* 
	        System.out.println(email);
	        System.out.println(username);
	        System.out.println(password);
	        */
	        
	       }catch (Exception e) {;
	       
	       e.printStackTrace();
	       
	       }
		
		
		Scanner a = new Scanner(System.in);
		
		int origin = 0;
		
		
	    	
	    	list1Category.add(new Category("Deportes", "Natacion", "10001"));
	    	list1Category.add(new Category("Deportes", "Baloncesto", "10002"));
	    	list1Category.add(new Category("Deportes", "Futbol", "10003"));
	    	
	    	list1Category.add(new Category("Tecnologia", "Ordenadores", "10011"));
	    	list1Category.add(new Category("Tecnologia", "Moviles", "10012"));
	    	list1Category.add(new Category("Tecnologia", "Televiones", "10013"));
	    	
	    	list1Category.add(new Category("Ropa y complementos", "Sudaderas", "10021"));
	    	list1Category.add(new Category("Ropa y complementos", "Camisetas", "10022"));
	    	list1Category.add(new Category("Ropa y complementos", "Pantalones", "1002"));
	    	

		
		while(origin!=3){
			
		System.out.println("User or Administrator.");
		System.out.println("1.User");
		System.out.println("2.Administrator");
		System.out.println("3.Go out");
		System.out.println("");
		System.out.println("Introduce the number of the option.");
		origin = a.nextInt();
		
		if(origin == 1) {
			
			pract.start();
			System.out.println("");
			
			Scanner df = new Scanner(System.in);

			int menu2 = 0;
			
			while(menu2 !=4) {
			
			System.out.println("1. Account");
			System.out.println("2. Products.");
			System.out.println("3. Categories.");
			System.out.println("4. Go out.");
			menu2 = df.nextInt();
			
			if(menu2 == 1) {
				
				pract.user_menu();
				
			}
			
			if(menu2 == 3) {
				
				System.out.println("Categories : ");
				System.out.println("");
				
				 for (int i = 0; i <= list1Category.size() - 1; i++) {
			       
					
				            
	    				   System.out.println(i+1 + "Category :"); 
	      				   System.out.println("//Name Category:  " + list1Category.get(i).NameCategory + " //SubCategory:  "
	      						   + list1Category.get(i).SubCategory + " //ID:  " + list1Category.get(i).IdCategory);
	      				   
	      				   System.out.println("");
				
				 }
				
			}
			
			
			
			}
			
			
		}
		
		if(origin == 2) {

	        Scanner p1 = new Scanner(System.in);
	        Scanner p2 = new Scanner(System.in);
	        Scanner p3 = new Scanner(System.in);
	        
	        String email,username,password;
			
			 System.out.println("Introduce an email : ");
		        email = p1.nextLine();
		        System.out.println("Introduce an username : ");
		        username = p2.nextLine();
		        System.out.println("Introduce a password : ");
		        password = p3.nextLine();

		        if(mal.equals(email)&&(na.equals(username))&&(pass.equals(password))) {
		        	
		        	pract.Administrator();
		        	
		        }else {
		        	
		        	origin = 3;
		        }	
		}
		else{	
			
			
			
		}
		
		}
		
		System.out.println("Goodbye");
		
	}
}