package Default;

import java.util.ArrayList;
import java.util.Iterator;

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
	
	public boolean pelikulaDago(String pPe) {
		//System.out.println("Buscando pelikula");
		Iterator<Pelikula> iter = lista.iterator();
		while(iter.hasNext()) {
			Pelikula p = iter.next();
			if(p.getIzena().equals(pPe)) {
				return true;
			}
		}
		//System.out.println("Ez dago pelikula hori gordeta");
		return false;
	}
	
}

