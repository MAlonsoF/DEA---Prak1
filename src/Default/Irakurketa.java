package Default;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Irakurketa {
		
	public Irakurketa() {}
	
	public void readFile(String izena) {
		try {
	    Scanner sarrera = new Scanner(new FileReader(izena));

	    String lerroa;
	    while (sarrera.hasNext()) {
	    	lerroa = sarrera.nextLine();
	    	String datuak[] = lerroa.split("###");
	    	
	    	String[] koAk = datuak[0].split("/");
	    	String kodeaAk = koAk[4];
	    	String izenaAk = datuak[1];
	    	String[] koPe = datuak[2].split("/");
	    	String kodeaPe = koPe[4];
	    	String izenaPe = datuak[3];
	    	
	    	System.out.println("Aktorea:"+kodeaAk+izenaAk);
	    	System.out.println("Pelikula:"+kodeaPe+izenaPe);
	    	
	    	Aktore a = new Aktore(izenaAk,kodeaAk);
	    	Pelikula p = new Pelikula(izenaPe, kodeaPe);
	    	a.filmaGehitu(p);
	    	p.aktoreGehitu(a);
	    	AktoreBiltegia.getAB().addAktore(a);
	    	PelikulaBiltegia.getPB().addPelikula(p);
	    }
	    sarrera.close();
	  } // try 
	  catch (IOException e) {
	    e.printStackTrace();
	  }                                 
	}
	
	
	public void fitxategiaSortu(String fIzena, String[] lerroak) {
		// Post: fIzena izeneko fitxategian idatzi dira lerroak
		  try {
		    PrintWriter writer = new PrintWriter(fIzena, "UTF-8");
		    for (String lerro: lerroak) {
		      writer.println(lerro);
		    }
		    writer.close();
		  } 
		  catch (IOException e) {
		    e.printStackTrace();
		  }
		}
	
}
