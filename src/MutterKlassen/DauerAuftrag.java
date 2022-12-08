package MutterKlassen;

public class DauerAuftrag {
	
	private String AuftragsID;
	private String kontoVonKontonummer;
	private String kontoZuKontonummer;
	private String UeberweisungsDatum;
	private int Betrag;
	
	
	public DauerAuftrag(String KontoVonKontonummer, String KontoZuKontonummer, String Datum, String Betrag, String AuftragsID){
		
		this.kontoVonKontonummer= KontoVonKontonummer;
		this.kontoZuKontonummer= KontoZuKontonummer;
		this.UeberweisungsDatum= Datum;
		this.Betrag= Integer.parseInt(Betrag);
		this.AuftragsID= AuftragsID;
		
	}
	
	
	public String getKontoVonID() {
		return kontoVonKontonummer;
	}
	public void setKontoVonID(String kontoVonID) {
		kontoVonKontonummer = kontoVonID;
	}
	public String getKontoZuID() {
		return kontoZuKontonummer;
	}
	public void setKontoZuID(String kontoZuID) {
		kontoZuKontonummer = kontoZuID;
	}
	public String getUeberweisungsDatum() {
		return UeberweisungsDatum;
	}
	public void setUeberweisungsDatum(String ueberweisungsDatum) {
		UeberweisungsDatum = ueberweisungsDatum;
	}
	public int getBetrag() {
		return Betrag;
	}
	public void setBetrag(int betrag) {
		Betrag = betrag;
	}


	public String getAuftragsID() {
		return AuftragsID;
	}


	public void setAuftragsID(String auftragsID) {
		AuftragsID = auftragsID;
	}


	public String getKontoVonKontonummer() {
		return kontoVonKontonummer;
	}


	public void setKontoVonKontonummer(String kontoVonKontonummer) {
		this.kontoVonKontonummer = kontoVonKontonummer;
	}


	public String getKontoZuKontonummer() {
		return kontoZuKontonummer;
	}


	public void setKontoZuKontonummer(String kontoZuKontonummer) {
		this.kontoZuKontonummer = kontoZuKontonummer;
	}
	
	
}
