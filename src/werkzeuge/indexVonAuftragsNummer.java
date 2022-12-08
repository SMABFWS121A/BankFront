package werkzeuge;

import java.util.List;

import MutterKlassen.DauerAuftrag;

public class indexVonAuftragsNummer {

public int IndexVonAuftragsNummer(List<DauerAuftrag> kontoList,String AuftragsId) {
		
		for (int i=0; i< kontoList.size();i++) {
			if(kontoList.get(i).getAuftragsID().equals(AuftragsId)) {
				return i;
			}
		}
		
		return -1;
	}
	
}
