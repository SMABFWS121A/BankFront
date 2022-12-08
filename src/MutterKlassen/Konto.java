package MutterKlassen;

public class Konto {

	public final int KontoNummer;
	public final String KontoEigentuemer;
	public final int Betrag;

	
	
	public Konto(int Nummer,String Name,int Betrag){
		this.KontoNummer = Nummer;
		this.KontoEigentuemer= Name;
		this.Betrag= Betrag;
	}
	
	public Konto(String Nummer,String Name,String Betrag){
		this.KontoNummer = Integer.parseInt(Nummer);
		this.KontoEigentuemer= Name;
		this.Betrag= Integer.parseInt(Betrag);
	}
	
	

//	public void setBetrag(int betrag) {
//		Betrag = betrag;
//	}
//
//	
//
//	public void setKontoNummer(int kontoNummer) {
//		KontoNummer = kontoNummer;
//		//zu change methode ändern
//	}
//
//	
//
//	public void setKontoEigentuemer(String kontoEigentuemer) {
//		KontoEigentuemer = kontoEigentuemer;
//		System.out.println("Moritz is the main");
//	}

}
