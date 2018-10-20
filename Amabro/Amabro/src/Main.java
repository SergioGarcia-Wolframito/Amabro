import java.util.List;
import java.io.FileReader;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Properties;
public class Main {

	static int Category_Number;
	
	static Main pract = new Main();
	
	static String mal,na,pass;
	static String mail = "",usuario = "",contra = "";
	
	static List <Category> list1Category = new ArrayList <Category>();
	static List <Product> list1Product = new ArrayList<Product>();
    
    
    void Administrator() {
    	
    	
    	Scanner am = new Scanner(System.in);

    	int Admin_menu = 0;
    	
    	while(Admin_menu!=3) {
    	
    	System.out.println("Welcome to the admin menu.");
    	System.out.println("1. Manage products");
    	System.out.println("2. Manage categories and sub categories");
    	System.out.println("3. Exit");  
    	
    	Admin_menu = am.nextInt();
    	
    	if(Admin_menu == 1) {
    		
    		Scanner ef = new Scanner(System.in);
    		int product_menu2 = 0;
    		
    		while(product_menu2 !=4) {
    			
    			System.out.println("Welcome to the manage product menu.");
        		System.out.println("1. View all the products");
        		System.out.println("2. Add product");
        		System.out.println("3. Delete a product");
        		System.out.println("4. Exit");
        		product_menu2 = ef.nextInt();
        		
        		
        		if(product_menu2 == 1) {
        			
        			System.out.println("");
        			System.out.println("---------------------------------------------------------------");
    			
    			   for (int i = 0; i <= list1Product.size() - 1; i++) {
            
    				   System.out.println(i+1 + "Product :"); 
      				   System.out.println("//Product Name:  " + list1Product.get(i).NameProduct + "//Product Price :"+list1Product.get(i).price+ "//Product Category: " 
    				   + list1Product.get(i).NameCategory + " //SubCategory:  "
      						   + list1Product.get(i).SubCategory + " //ID:  " + list1Product.get(i).IdCategory);
      				   
      				   System.out.println("");
      				   
        			}
        			
        			
        		}
        		
        		if(product_menu2 == 2) {

        		Scanner fb = new Scanner(System.in);	
        		Scanner ft = new Scanner(System.in);	
        		Scanner fg = new Scanner(System.in);
    			Scanner fl = new Scanner(System.in);
    			Scanner fi = new Scanner(System.in);
    			
    			String product_name = "", name_category = "", sub_category = "", i_d = "";
    			float pr_price;
    			
    			System.out.println("To create a new product introduce Product Name, Product Price, Category Name, Sub Category Name and Category ID");
    			System.out.println("");
    			System.out.println("Product Name : ");
    			product_name = fb.nextLine();
    			System.out.println("Product Price :");
    			pr_price = ft.nextFloat();
    			System.out.println("Category name : ");
    			name_category = fg.nextLine();
    			System.out.println("Sub Category name : ");
    			sub_category = fl.nextLine();
    			System.out.println("Category ID : ");
    			i_d = fi.nextLine();
    			
    			if(product_name !="" && pr_price!=0 && name_category!="" && sub_category!="" && i_d!="") {
    			
    			list1Product.add(new Product(pr_price,product_name,name_category, sub_category, i_d ));
    			
    			}
	
        		}
        		
        		if(product_menu2 == 3) {
        			
        			       			 
        			int delete_product;
    				Scanner yl = new Scanner(System.in);
    				System.out.println("Introduce the number of theproduct that you want to delete.");
    				delete_product = yl.nextInt();
    				delete_product = delete_product -1;
    			
    				list1Product.remove(delete_product);
 
        		}
        		

    		}
    		
    		
    	}
    	
    	if(Admin_menu==2) {
    		
    		Scanner az = new Scanner(System.in);
    		
    		int admin_menu_2 = 0;
    		
    		while(admin_menu_2 != 4) {
    			
    		System.out.println("Welcome to the manage category menu.");
    		System.out.println("1. View all the categories and sub categories");
    		System.out.println("2. Add category and sub category");
    		System.out.println("3. Delete a category and sub category");
    		System.out.println("4. Exit");
    		
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
    			
    			System.out.println("");
    			System.out.println("---------------------------------------------------------------");
    			
    			   for (int i = 0; i <= list1Category.size() - 1; i++) {
            
    				   System.out.println(i+1 + "Category :"); 
      				   System.out.println("//Name Category:  " + list1Category.get(i).NameCategory + " //SubCategory:  "
      						   + list1Category.get(i).SubCategory + " //ID:  " + list1Category.get(i).IdCategory);
      				   
      				   System.out.println("");
      				   
        		}
	
    		}
    		
    		if(admin_menu_2 == 3) {
    			
    			int delete_number;
    			Scanner yf = new Scanner(System.in);
    			System.out.println("Introduce the number of the category and sub category that you want to delete.");
    			delete_number = yf.nextInt();
    			delete_number = delete_number -1;
    			
    			list1Category.remove(delete_number);
    			
    			
    		}
    		
    		
    		
    		
    		
    		}
    		
    		
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
		
		
	    	
	    	list1Category.add(new Category("Deportes", "Natacion", "10010"));
	    	list1Category.add(new Category("Deportes", "Baloncesto", "10010"));
	    	list1Category.add(new Category("Deportes", "Futbol", "10010"));
	    	
	    	list1Category.add(new Category("Tecnologia", "Ordenadores", "10011"));
	    	list1Category.add(new Category("Tecnologia", "Moviles", "10012"));
	    	list1Category.add(new Category("Tecnologia", "Televiones", "10013"));
	    	
	    	list1Category.add(new Category("Ropa y complementos", "Sudaderas", "10021"));
	    	list1Category.add(new Category("Ropa y complementos", "Camisetas", "10022"));
	    	list1Category.add(new Category("Ropa y complementos", "Pantalones", "1002"));
	    	
	    	
	    	list1Product.add(new Product(11, "Gorro de Natacion","Deportes", "Natacion", "10011"));
	    	list1Product.add(new Product(10, "Bañador","Deportes","Natacion", "10012"));
	    	
	    	list1Product.add(new Product(8, "Balon de Baloncesto","Deportes", "Baloncesto", "10011"));
	    	list1Product.add(new Product(10, "Balon de Futbol","Deportes", "Baloncesto", "10011"));
	    	
	    	list1Product.add(new Product(12, "Guantes de Portero","Deportes" , "Futbol", "10011"));
	    	list1Product.add(new Product(40, "Botas","Deportes" , "Futbol", "10011"));
	    	
	    	
	    	list1Product.add(new Product(150, "Xiaomi 4","Tecnologia" , "Ordenadores", "10011"));
	    	list1Product.add(new Product(157, "Dell Lao","Tecnologia" , "Ordenadores", "10011"));
	    	
	    	list1Product.add(new Product(100, "Xiamo Paco","Tecnologia" , "Moviles", "10011"));
	    	list1Product.add(new Product(15, "Motorola Final","Tecnologia" , "Moviles", "10011"));
	    	
	    	list1Product.add(new Product(1554, "Pepe Tv","Tecnologia" , "Televiones", "10011"));
	    	list1Product.add(new Product(1509, "Sony Tv","Tecnologia" , "Televiones", "10011"));
	    	
	    	
	    	list1Product.add(new Product(15, "Sudadera Otoño","Ropa y complementos" , "Sudaderas", "10011"));
	    	list1Product.add(new Product(16, "Sudadera Arctic Monkeys","Ropa y complementos" , "Sudaderas", "10011"));
	    	
	    	list1Product.add(new Product(5, "Camiseta One Piece","Ropa y complementos" , "Camisetas", "10011"));
	    	list1Product.add(new Product(17, "Camiseta Tirantes Velax","Ropa y complementos" , "Camisetas", "10011"));
	    	
	    	list1Product.add(new Product(25, "Shorts","Ropa y complementos" , "Pantalones", "10011"));
	    	list1Product.add(new Product(11, "Pesqueros","Ropa y complementos" , "Pantalones", "10011"));
	    	
		
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
			
			while(menu2 !=5) {
			
			System.out.println("1. Account");
			System.out.println("2. Products.");
			System.out.println("3. Categories.");
			System.out.println("4. Change product price to dollars.");
			System.out.println("5. Go out.");
			menu2 = df.nextInt();
			
			if(menu2 == 1) {
				
				pract.user_menu();
				
			}
			
			
			if(menu2 == 2) {
				
				Scanner dr = new Scanner(System.in);
				System.out.println("List of Categories :");
				
				System.out.println("");
    			System.out.println("---------------------------------------------------------------");
				
				for (int i = 0; i <= list1Category.size() - 1; i++) {

 				   System.out.println(i+1 + "Category :"); 
   				   System.out.println("//Name Category:  " + list1Category.get(i).NameCategory + " //SubCategory:  "
   						   + list1Category.get(i).SubCategory + " //ID:  " + list1Category.get(i).IdCategory);
   				   
   				   System.out.println("");
			
				}
				
				System.out.println("");
				System.out.println("Introduce the number of the category.");
				Category_Number = dr.nextInt();
				
				Category_Number = Category_Number -1;
				
				String hola = list1Category.get(Category_Number).NameCategory;
				
				System.out.println("");
    			System.out.println("---------------------------------------------------------------");
				
				for (int i = 0; i <= list1Product.size() - 1; i++) {
		            
					if(hola.equals(list1Product.get(i).NameCategory)) {
					
 				   System.out.println(i+1 + "Product :"); 
   				   System.out.println("//Product Name:  " + list1Product.get(i).NameProduct + "//Product Price :"+list1Product.get(i).price);
   				   System.out.println("");
					
					}
   				   
     			}
								
	
			}
			
			
			if(menu2 == 3) {
				
				System.out.println("Categories : ");
				System.out.println("");
    			System.out.println("---------------------------------------------------------------");
				
				 for (int i = 0; i <= list1Category.size() - 1; i++) {
    
	    				   System.out.println(i+1 + "Category :"); 
	      				   System.out.println("//Name Category:  " + list1Category.get(i).NameCategory + " //SubCategory:  "
	      						   + list1Category.get(i).SubCategory + " //ID:  " + list1Category.get(i).IdCategory);
	      				   
	      				   System.out.println("");
				
				 }
				
			}
			
			if(menu2 == 4) {
				
				int menu2dollar;
				Scanner hg = new Scanner(System.in);
				
				System.out.println("Introduce the number of the product that you want to see the price in Dollars.");
				menu2dollar = hg.nextInt();
				menu2dollar = menu2dollar -1;
				
				float price_to_dollar = list1Product.get(menu2dollar).price;
				
				System.out.println("The price in dollars is : "+ Product.dolar(price_to_dollar) );
				System.out.println("");
				
				
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
		        	System.out.println("");
		        	pract.Administrator();
		        	
		        }else {
		        	
		        	origin = 3;
		        }	
		}
		else{	
			
			
			
		}
		
		}
		
		System.out.println("Goodbye");
		System.out.println("");
	}
}