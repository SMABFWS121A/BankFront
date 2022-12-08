package werkzeuge;

import java.util.List;

import MutterKlassen.Konto;

public class indexVonKontonummer {

	public int IndexVonKontonummer(List<Konto> kontoList,String Kontonummer) {
		
		for (int i=0; i< kontoList.size();i++) {
			if(kontoList.get(i).KontoNummer== Integer.parseInt(Kontonummer)) {
				return i;
			}
		}
		
		return -1;
	}
	
	
}
