package romero.agustin.p1.pb2;
import static org.junit.Assert.*;
import org.junit.Test;
public class PrimerParcialTest {
	
	@Test
	public void queExistaUnLibro() {
		Geografia nuevo1 = new Geografia(10,"Geografias Argentinas","Pepe");
		Matematica nuevo2= new Matematica(20,"Calculo Diferencia", "Juan");
		Historia nuevo3= new Historia(30,"Revolucion Francesa", "Jose");
		assertNotNull(nuevo1);
		assertNotNull(nuevo2);
		assertNotNull(nuevo3);
		assertEquals((Integer)10,nuevo1.getCodigoLibro());
		assertEquals((Integer)20,nuevo2.getCodigoLibro());
		assertEquals((Integer)30,nuevo3.getCodigoLibro());
	}
}
