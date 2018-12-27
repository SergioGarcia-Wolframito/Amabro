import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class DescuentoTest {

	Descuento_ des = new Descuento_();
	

	

	
	@Test
	void test() {
		
		des.manche();
		des.maining();
		des.getCodigo();
		des.getDescuento();
		
		assertEquals(des.getCodigo(),"#Xy123z743A");
		assertEquals(des.getDescuento(),8,0);
		
	}

}
