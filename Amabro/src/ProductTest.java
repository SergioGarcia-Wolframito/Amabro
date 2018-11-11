import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class ProductTest {

	@Test
	void test() {
		
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
