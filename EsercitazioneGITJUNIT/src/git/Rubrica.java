package git;

import java.util.ArrayList;


public class Rubrica {
	ArrayList<String> contatti;

	public Rubrica() {
		start();
	}

	public void aggiungiContatto(String s) {
		contatti.add(s);
	}

	public String prendiContatto(String s) {
		if (!contatti.contains(s))
			throw new IllegalArgumentException("Invalid name: " + s);
		return contatti.get(contatti.indexOf(s));
	}

	public void rimuoviContatto(String s) {
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

	public ArrayList<String> getContatti(){
		return contatti;
	}
	
	public void start() {
		contatti = new ArrayList<>();
	}
}
