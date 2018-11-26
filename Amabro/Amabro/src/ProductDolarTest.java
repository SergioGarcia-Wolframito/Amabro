import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ProductDolarTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void testDolar() {
		
		double prueba = 5 * 1.15;
		assertEquals(Product.dolar(5), prueba);
		
		
		double prueba2 = 6 *1.15;
		assertEquals(Product.dolar(6), prueba2);
		

	}

	

}
