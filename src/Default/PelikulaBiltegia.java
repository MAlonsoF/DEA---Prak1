package Default;

import java.util.ArrayList;

public class PelikulaBiltegia {

	private static PelikulaBiltegia nPB = null;
	private ArrayList<Pelikula> lista = new ArrayList<Pelikula>();
	
	private PelikulaBiltegia() {}
	
	public static PelikulaBiltegia getPB() {
		if(nPB==null){
			nPB= new PelikulaBiltegia();
		}
		return nPB;
	}
	
	public void addPelikula(Pelikula pPelikula) {
		lista.add(pPelikula);
	}

	public void deletePelikulak() {
		lista.clear();
	}
	
}

