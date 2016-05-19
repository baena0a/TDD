import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testTDD {
	private TDD tdd;

	@Before
	public void SetUp() {
		tdd = new TDD();
	}

	@Test
	public void añadirClaveValor() {
		tdd.put("Nombre", "Luis");
		assertEquals("Luis"	, tdd.get("Nombre"));
	}
	@Test(expected = TDDException.class)
	public void NoExisteClave() {
		tdd.get("Apellido");
	}
	@Test
	public void añadirDosValoresConMismaClave() {
		tdd.put("Nombre", "Luis");
		assertEquals("Luis", tdd.get("Nombre"));
		tdd.put("Nombre", "Antonio");
		assertEquals("Antonio",	tdd.get("Nombre"));
	}
	@Test
	public void añadirDosValoresYDosClave() {
		tdd.put("Nombre", "Luis");
		assertEquals("Luis", tdd.get("Nombre"));
		tdd.put("Apellido", "Matamoros");
		assertEquals("Matamoros",	tdd.get("Apellido"));
	}
	@Test
	public void DarValorPorDefectoSiNoExiste() {
		tdd.put("Nombre", "Juan");
		assertEquals("Juan", tdd.getOrElse("Nombre","-"));
	}
	@Test
	public void ExisteClave() {
		tdd.put("Nombre", "Miguele");
		assertEquals(true, tdd.containsKey("Nombre"));
	}
	@Test
	public void ExisteNoClave() {
		tdd.put("Apellido", "Martinez");
		assertEquals(false, tdd.containsKey("Nombre"));
	}
	
	
	
}
