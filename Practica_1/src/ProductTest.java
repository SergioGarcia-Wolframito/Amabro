import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductTest {

	@Test
	void test() {
		
		User jony = new User("Jony", null, null);
		
		assertEquals(jony.getName(),"Jony");
	}

}
