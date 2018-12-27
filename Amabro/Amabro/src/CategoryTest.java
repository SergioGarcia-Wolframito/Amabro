import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CategoryTest {

	@Test
	void test() {
		
		Category jony = new Category("Tecnology", "MobilePhone", "15002");
		Category cate = new Category("Velax", "MobilePhone", "15324");
		
		assertEquals(jony.getNameCategory(),"Tecnology");
		assertEquals(jony.getSubCategory(),"MobilePhone");
		assertEquals(jony.getIdCategory(),"15002");
		
		assertEquals(cate.getNameCategory(),"Velax");
		assertEquals(cate.getSubCategory(),"MobilePhone");
		assertEquals(cate.getIdCategory(),"15324");
		
	}
}
