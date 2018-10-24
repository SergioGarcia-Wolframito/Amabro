import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class UserTest {

	@Test
	void test() {
		
		User user = new User("Amancio", "Velax", "123pez");
		
		assertEquals(user.getName(),"Amancio");
		assertEquals(user.getEmail(),"Velax");
		assertEquals(user.getPassword(),"123pez");
		
	}

}
