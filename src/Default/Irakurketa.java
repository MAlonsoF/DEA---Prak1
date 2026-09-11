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
	    int kont = -1;
	    while (sarrera.hasNext()) {
	      lerroa = sarrera.nextLine();
	      String datuak[] = lerroa.split("###");
	      for (String s: datuak) {
	    	  kont++; 
	    	  switch(kont) {
	    	  	case 0: 
	    	  		
	    	  }
	    		  
	    	  System.out.println(s);
	      }
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
