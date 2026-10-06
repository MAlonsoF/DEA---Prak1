package Default;

import java.util.ArrayList;

public class Aktore {

	private String izena;
	private String kodea;
	private ArrayList<Pelikula> filmak = new ArrayList<Pelikula>();
	
	public Aktore(String pIzena, String pKodea) {
		this.izena = pIzena;
		this.kodea=pKodea;
	}
	
	public void filmaGehitu(Pelikula pFilma) {
		this.filmak.add(pFilma);
	}

	public String getIzena() {
		return this.izena;
	}
	
	public String getKodea() {
		return this.kodea;
	}
	
	public ArrayList<Pelikula> filmakAtera(){
		return filmak;
	}
}
