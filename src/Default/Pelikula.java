package Default;

import java.util.ArrayList;

public class Pelikula {

	private String izena;
	private String kodea;
	private ArrayList<Aktore> aktoreak = new ArrayList<Aktore>();
	
	public Pelikula(String pIzen, String pKodea) {
		this.izena=pIzen;
		this.kodea=pKodea;
	}
	
	public void aktoreGehitu(Aktore pAk) {
		this.aktoreak.add(pAk);
	}
	
}
