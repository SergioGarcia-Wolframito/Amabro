import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ProductTest {

	@Test
	void test() {
		
		//float Price,String nameproduct,String NC, String SC, String IC, boolean sto,boolean comp,int c,int cc
		Product product = new Product(0, "Xiaomi Mi 8","Tecnology", "MobilePhone", "15002", false,false,10,0);
		
		assertEquals(product.getPrice(),0);
		assertEquals(product.getNameProduct(),"Xiaomi Mi 8");
		assertEquals(product.getStock(),false);
		assertEquals(product.getCompra(),false);
		assertEquals(product.getCantidadcomprados(),0);
		assertEquals(product.getCantidad(),10);
		assertEquals(product.getNameCategory(),"Tecnology");
		assertEquals(product.getSubCategory(),"MobilePhone");
		assertEquals(product.getIdCategory(),"15002");
		
	}

}
