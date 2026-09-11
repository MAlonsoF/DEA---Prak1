package Default;

import java.util.ArrayList;

public class AktoreBiltegia {

	private AktoreBiltegia nAB ;
	private ArrayList<Aktore> lista;
	
	private AktoreBiltegia() {}
	
	public AktoreBiltegia getAB() {
		if(nAB==null){
			nAB= new AktoreBiltegia();
		}
		return nAB;
	}
	
	public void addAktore(Aktore pAktore) {
		lista.add(pAktore);
	}
	
}

