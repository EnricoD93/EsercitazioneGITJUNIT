package git;

import java.util.ArrayList;

import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;

public class Rubrica {
	ArrayList<String> contatti;

	public Rubrica() {
		start();
	}

	void aggiungiContatto(String s) {
		contatti.add(s);
	}

	String prendiContatto(String s) {
		if (!contatti.contains(s))
			throw new IllegalArgumentException("Invalid name: " + s);
		return contatti.get(contatti.indexOf(s));
	}

	void rimuoviContatto(String s) {
		if (contatti.contains(s))
			contatti.remove(s);
		else
			try {
				throw new Exception("Non trovato");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public void start() {
		contatti = new ArrayList<>();
	}
}
