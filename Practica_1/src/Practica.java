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
	
	static String BookName = "";
	static String BookWritter = "";
	static String Brand = "";
	static int Page_Number = 0;
	static String ISBN = "";
	static float book_price = 0;
	
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
		
		
		
		Product product_1 = new Product(product_pr, product_n, category_n, category_sub, category_id);
		
		Books book = new Books(book_price, BookName, "", "", "", BookWritter, Brand, Page_Number, ISBN);
		

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
			System.out.println("3. Go to the product menu.");
			System.out.println("4. Product settings. ");
			System.out.println("5. Go to the book menu.");
			System.out.println("6. Go to the book settings.");
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
			
		{
			if(number_menu == 3) {
			
				System.out.println("Welcome to the product menu.");
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
				
				
				
			}
		}	
			
			break;
			
			
		case 4:
			
		{
			
			Product product_2 = new Product(product_pr, product_n, category_n, category_sub, category_id);
			
			Scanner k1 = new Scanner(System.in);
			int men_u = 0;
			
			System.out.println("Welcome to the product settings.");
			System.out.println("");
			System.out.println("1. Change price to dolars.");
			System.out.println("2. Change product characteristis.");
			System.out.println("3. View product.");
			System.out.println(" Introduce the option number.");	
		    men_u = k1.nextInt();
			
		    if(men_u==1) {
		    	
		    	
		    	
		    	System.out.println("The price in dolars is: " + (product_2.getPrice() * 1.15));
		    	
				break;

		    }
		    
		    if(men_u == 2) {
		    	
		    	int if_choice;
		    	Scanner f1 = new Scanner(System.in);
		    	
		    	
		    	
		    	
		    	System.out.println("Welcome to the menu of change product characteristics");
		    	System.out.println("");
		    	System.out.println("1. Change product name ." );
				System.out.println("2. Change product price ." );
				System.out.println("3. Change category name .");
				System.out.println("4. Change sub Category name .");
				System.out.println("5. Change Id Category .");
		    	System.out.println("Introduce the number of what you want to change. ");
		    	if_choice = f1.nextInt();
				
				if(if_choice == 1) {
					Scanner f2 = new Scanner(System.in);
					String pr_na_me;
					System.out.println("Introduce the new product name.");
					pr_na_me = f2.nextLine();
					product_2.setNameProduct(pr_na_me);
					
				}
				
				if(if_choice == 2) {
					Scanner f3 = new Scanner(System.in);
					float pr_pri_ce;
					System.out.println("Introduce the new product price.");
					pr_pri_ce = f3.nextFloat();
					product_2.setPrice(pr_pri_ce);
					
				}
				
				if(if_choice == 3) {
					Scanner f4 = new Scanner(System.in);
					String name_cate_go_ry;
					System.out.println("Introduce the new category name.");
					name_cate_go_ry = f4.nextLine();
					product_2.setNameCategory(name_cate_go_ry);
				}
				
				if(if_choice == 4) {
					Scanner f5 = new Scanner(System.in);
					String sub_name_cate_gory;
					System.out.println("Introduce the new sub category name.");
					sub_name_cate_gory = f5.nextLine();
					product_2.setSubCategory(sub_name_cate_gory);
				}
				
				if(if_choice == 5) {
					
					Scanner f6 = new Scanner(System.in);
					String I_D;
					System.out.println("Introduce the new ID category name.");
					I_D = f6.nextLine();
					product_2.setIdCategory(I_D);
				}
				
				else {
					
					break;
					
				}
					
		    }
		    
		    if(men_u == 3) {
		    	
		    	
		    	
		    	System.out.println("Product name : " + product_2.getNameProduct());
				System.out.println("Product price :" +  product_2.getPrice());
				System.out.println("Category name :" +  product_2.getNameCategory());
				System.out.println("Sub Category name :" +  product_2.getSubCategory());
				System.out.println("Id Category :" +  product_2.getIdCategory());
		    	
		    	
		    }	
		}
			
		break;
		
		
		case 5:
			
		{
			
			
			System.out.println("Welcome to the Book menu.");
			
			Scanner t1 = new Scanner(System.in);
			System.out.println("Introduce the book price.");
			book_price = t1.nextFloat();
			Scanner t2 = new Scanner(System.in);
			System.out.println("Introduce the book name.");
			BookName = t2.nextLine();
			Scanner t3 = new Scanner(System.in);
			System.out.println("Introduce the book writter name.");
			BookWritter = t3.nextLine();
			Scanner t4 = new Scanner(System.in);
			System.out.println("Introduce the brand of the book.");
			Brand = t4.nextLine();
			Scanner t5 = new Scanner(System.in);
			System.out.println("Introduce the number of pages.");
			Page_Number = t5.nextInt();
			Scanner t6 = new Scanner(System.in);
			System.out.println("Introduce the ISBN.");
			ISBN = t6.nextLine();
			
			
			
		}
		
		break;
		
		
		case 6:
			
		{
			
			Books book1 = new Books(book_price, BookName, "", "", "", BookWritter, Brand, Page_Number, ISBN);
			Scanner d = new Scanner(System.in);
			int menu3;
			System.out.println("Welcome to the Book settings.");
			System.out.println("");
			System.out.println("1. Change price to dolars.");
			System.out.println("2. Change book characteristis.");
			System.out.println("3. View book.");
			System.out.println(" Introduce the option number.");
			menu3 = d.nextInt();
			
			
			
			if(menu3==1) {
				
				System.out.println("The price in dolars is: " + (book1.getPrice() * 1.15));
		    	
				break;
				
				
			}
			
			if(menu3==2) {
				
				int if_choise;
		    	Scanner n1 = new Scanner(System.in);
		    	
		  //Books book1 = new Books(book_price, BookName, "", "", "", BookWritter, Brand, Page_Number, ISBN);
		    	
		    	System.out.println("Welcome to the menu of change Book characteristics");
		    	System.out.println("");
		    	System.out.println("1. Change book name ." );
				System.out.println("2. Change book price ." );
				System.out.println("3. Change book writter .");
				System.out.println("4. Change brand .");
				System.out.println("5. Change page number .");
				System.out.println("6. Change book ISBN .");
		    	System.out.println("Introduce the number of what you want to change. ");
		    	if_choise = n1.nextInt();
				
				if(if_choise == 1) {
					
					Scanner n2 = new Scanner(System.in);
					String bo_na_me;
					System.out.println("Introduce the new book name.");
					bo_na_me = n2.nextLine();
					book1.setNameProduct(bo_na_me);
					
				}
				
				if(if_choise == 2) {
					Scanner n3 = new Scanner(System.in);
					float bookpr_pri_ce;
					System.out.println("Introduce the new book price.");
					bookpr_pri_ce = n3.nextFloat();
					book1.setPrice(bookpr_pri_ce);
					
				}
				
				if(if_choise == 3) {
					Scanner n4 = new Scanner(System.in);
					String name_wri_ttery;
					System.out.println("Introduce the new book writter.");
					name_wri_ttery = n4.nextLine();
					book1.setBookWritter(name_wri_ttery);
				}
				
				if(if_choise == 4) {
					Scanner n5 = new Scanner(System.in);
					String book_bra_nd;
					System.out.println("Introduce the new brand.");
					book_bra_nd = n5.nextLine();
					book1.setBookBrand(book_bra_nd);
				}
				
				if(if_choise == 5) {
					
					Scanner n6 = new Scanner(System.in);
					int B_P;
					System.out.println("Introduce the new page number.");
					B_P = n6.nextInt();
					book1.setBookPage(B_P);
				}
				
				
				if(if_choise == 6) {
					
					Scanner n7 = new Scanner(System.in);
					String isbn;
					System.out.println("Introduce the new ISBN");
					isbn = n7.nextLine();
					book1.setISBN(isbn);
					
					
				}
				
				else {
					
					break;
					
				}
				
				
				
				
			}
			
			if(menu3==3) {
				
				
				System.out.println("Book name : " + book1.getNameProduct());
				System.out.println("Book price :" +  book1.getPrice());
				System.out.println("Book writter :" +  book1.getBookWritter());
				System.out.println("Book brand :" +  book1.getBookBrand());
				System.out.println("Page number :" +  book1.getBookPages());
				System.out.println("Book ISBN :" +  book1.getISBN());
				
				
			}
			
			
			
			
		}
		
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
	        
	        System.o =out.println(email);
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
