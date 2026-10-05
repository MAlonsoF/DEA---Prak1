package Default;

import java.util.ArrayList;
import java.util.Iterator;

public class AktoreBiltegia {

	private static AktoreBiltegia nAB = null;
	private ArrayList<Aktore> lista = new ArrayList<Aktore>();
	
	private AktoreBiltegia() {}
	
	public static AktoreBiltegia getAB() {
		if(nAB==null){
			nAB= new AktoreBiltegia();
		}
		return nAB;
	}
	
	public void addAktore(Aktore pAktore) {
		lista.add(pAktore);
	}
	
	public void deleteAktoreak() {
		lista.clear();
	}

	
	public Aktore aktoreaBilatu(String pIz) {
		Iterator<Aktore> iter = lista.iterator();
		while(iter.hasNext()) {
			Aktore a = iter.next();
			/*if(a.getIzena().equals(pIz)) {
				return a;
			}	*/
			System.out.println(a.getIzena()+a.getKodea());
		}
		System.out.println("Ez dago aktore hori gordeta");
		return null;
		
	}
}

