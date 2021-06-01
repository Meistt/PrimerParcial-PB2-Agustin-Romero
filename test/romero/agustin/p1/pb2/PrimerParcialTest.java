package romero.agustin.p1.pb2;
import static org.junit.Assert.*;
import org.junit.Test;
public class PrimerParcialTest {
	
	@Test
	public void queExistaUnLibro() {
		Geografia nuevo1 = new Geografia(10,"Geografias Argentinas","Pepe");
		Matematica nuevo2= new Matematica(20,"Calculo Diferencia", "Juan");
		Historia nuevo3= new Historia(30,"Revolucion Francesa", "Jose");
		assertNotNull(nuevo1);//para geografia
		assertNotNull(nuevo2);//para matematica
		assertNotNull(nuevo3);//para historia
		assertEquals((Integer)10,nuevo1.getCodigoLibro());
		assertEquals((Integer)20,nuevo2.getCodigoLibro());
		assertEquals((Integer)30,nuevo3.getCodigoLibro());
	}
	@Test 
	public void queExistaUnEstudianteRegistradoEnLaBiblioteca() {
		Estudiante nuevo= new Estudiante(41716163,"Agustin", "Romero");
		assertNotNull(nuevo);
		assertEquals((Integer)41716163, nuevo.getDni());
	}
	
	@Test
	public void queUnEstudiantePuedaPedirPrestadoUnLibroYSeanSolo2Permitidos() {
		Estudiante nuevo= new Estudiante(41716163,"Agustin", "Romero");
		Boolean estado= false; //falso porque no ha hecho ningun prestamo y todavía puede pedir los 2 que se le permite
		Boolean estadoRetorno;
		assertTrue(estadoRetorno=nuevo.pedirPrestadoUnLibro(estado));
		//assertTrue(nuevo.pedirPrestadoUnSegundoLibro());
	}
}
