import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CategoryTest {

	@Test
	void test() {
		
		Category jony = new Category("Tecnology", "MobilePhone", "15002");
		
		assertEquals(jony.getNameCategory(),"Tecnology");
		assertEquals(jony.getSubCategory(),"MobilePhone");
		assertEquals(jony.getIdCategory(),"15002");
		
	}
}
