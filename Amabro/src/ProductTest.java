import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ProductTest {

	@Test
	void test() {
		
		Product product = new Product(0, "Tecnology", "MobilePhone", "15002", "Xiaomi Mi 8", false);
		
		assertEquals(product.getPrice(),0);
		assertEquals(product.getNameProduct(),"Xiaomi Mi 8");
		assertEquals(product.getStock(),false);
		
	}

}
