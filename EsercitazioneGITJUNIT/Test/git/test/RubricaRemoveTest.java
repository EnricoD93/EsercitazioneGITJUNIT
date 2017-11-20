package git.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import git.Rubrica;

public class RubricaRemoveTest {
	static Rubrica r;

	@BeforeClass
	public static void init() {
		r = new Rubrica();
	}
	
	@Before
	public void aggiungiContattoTest() {
		r.aggiungiContatto("Maria");
	}
	
	
	@Test
	public void rimuoviContattoTest() {
		r.rimuoviContatto("Maria");
		assertEquals(0, r.getContatti().size());
	}
}
