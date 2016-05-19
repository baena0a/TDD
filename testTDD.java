import static org.junit.Assert.assertEquals;

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

}
