package git.test;

import org.junit.Before;
import org.junit.Test;

import git.Rubrica;

public class RubricaTest {

	Rubrica r;

	@Before
	public void start() {
		r = new Rubrica();
	}

	@Test(expected = IllegalArgumentException.class)
	public void prendiContattoTest() {
		r.prendiContatto("ciao");
	}

}
