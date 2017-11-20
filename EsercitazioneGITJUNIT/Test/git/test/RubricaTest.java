package git.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import git.Rubrica;

public class RubricaTest {

	Rubrica r;
	
	
	@Before
	public void start() {
		r=new Rubrica();
	}
	
	@Test
	public void aggiungiContattoTest() {
		r.aggiungiContatto("Maria");
		assertEquals(1, r.getContatti().size());
	}
	

	
	
}
