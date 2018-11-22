import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class UserTest  {

	@Test
	void test() {
		
		User main = new User();
		
		MainProxy manin = new MainProxy();
		
		
		
		
		main.setMainName("Amancio");
		main.setMainEmail("Amancio");
		main.setMainPassword("Amancio");
		
		
		assertEquals(main.getMainName(),"Amancio");
		assertEquals(main.getMainEmail(),"Amancio");
		assertEquals(main.getMainPassword(),"Amancio");
		
		
		manin.setMainName("Amancio1");
		manin.setMainEmail("Amancio1");
		manin.setMainPassword("Amancio1");
		
		
		assertEquals(manin.getMainName(),"Amancio1");
		assertEquals(manin.getMainEmail(),"Amancio1");
		assertEquals(manin.getMainPassword(),"Amancio1");
		
		
		
		
	}

	

}
