import java.io.FileReader;
import java.util.Properties;

public class Descuento_{
	
	static String codigo = "";
	static float descuento = 0;
	
	static String alm1;

	public  void manche(){
		
		
		class Inner_Descuento {
			
			public void descuent() {
		
		try(FileReader reader =  new FileReader("Descuento.properties")) {
			
		       Properties properties = new Properties();
		       properties.load(reader);
		        
		       String codig = properties.getProperty("codigo1");
		      
		        alm1 = codig;
		        
		       }catch (Exception e) {
		       
		       e.printStackTrace();	       
		       
		       }
		
		}
			
			
		
			
			
			
		}
		
		Inner_Descuento descue = new Inner_Descuento();
		descue.descuent();
		
		
	}
	
	public void maining() {
		
	       codigo = alm1;
	       descuento = 8; 
	         
	}
	
	protected String getCodigo() {
		return codigo;
	}

	protected float getDescuento() {
		return descuento;
	}

}
