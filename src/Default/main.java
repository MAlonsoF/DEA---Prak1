package Default;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Irakurketa irakur = new Irakurketa();
		
		/*AktoreBiltegia.getAB().deleteAktoreak();
		PelikulaBiltegia.getPB().deletePelikulak();
		*/
		
		irakur.readFile("C:\\Users\\marco\\OneDrive\\Documentos\\Uni\\DEA\\Praktika1\\Informacion para el codigo\\movies-dir\\movies-dir\\actors_and_films_1970.txt");
		Aktore ak = AktoreBiltegia.getAB().aktoreaBilatu(" Ənvər Həsənov ");
		if(ak!=null) {
			System.out.println(ak.getIzena()+ak.getKodea());
		}
		
		Aktore aktoreBerria = new Aktore(" Randal Vladistok ", "Q6767");
		AktoreBiltegia.getAB().addAktore(aktoreBerria);
		AktoreBiltegia.getAB().aktoreakErakutsi();
		
		AktoreBiltegia.getAB().aktoreaEzabatuIzenaz(" Randal Vladistok ");
		AktoreBiltegia.getAB().aktoreakErakutsi();
		
		
		
		
		
	}
}
