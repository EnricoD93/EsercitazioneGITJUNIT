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

	String prendiContatto(int i) {
		if (i < contatti.size())
			return contatti.get(i);
		return null;
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
