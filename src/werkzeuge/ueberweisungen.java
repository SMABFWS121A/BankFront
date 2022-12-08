package werkzeuge;

import MutterKlassen.Konto;

public class ueberweisungen {

	Konto Von;
	Konto Zu;
	int Betrag;
	
	
	public ueberweisungen(Konto Von, Konto Zu, int  Betrag) {
		
		this.Von= Von;
		this.Zu= Zu;
		this.Betrag= Betrag;
		
	}
	
	public boolean ausfuehren() {
		
		if(istGeldDa()) {
			
			Von.setBetrag(Von.getBetrag()-Betrag);
			Zu.setBetrag(Zu.getBetrag()+Betrag);
			
			return true;
		}
		
		return false;
	}
	
	
	private boolean istGeldDa(){
		
		if(Von.getBetrag()-Betrag>=0) {
			
			return true;
			
		}
		else {
			
			return false;
			
		}
		
	}
	
}
