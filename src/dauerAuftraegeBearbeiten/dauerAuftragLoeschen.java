package dauerAuftraegeBearbeiten;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import MutterKlassen.DauerAuftrag;
import werkzeuge.indexVonAuftragsNummer;

public class dauerAuftragLoeschen {
	
	List<DauerAuftrag> auftragListe;
	String File;
	int index;
	
	public dauerAuftragLoeschen( String File) {
		
		this.File= File;
	}
	
	
	public void loeschen(List<DauerAuftrag> auftragList,String AuftragsId) throws IOException {
		this.auftragListe= auftragList;
	    FileWriter writer = new FileWriter(File);  
	    BufferedWriter buffer = new BufferedWriter(writer);
		indexVonAuftragsNummer IVAN= new indexVonAuftragsNummer();
	    index= IVAN.IndexVonAuftragsNummer(auftragList, AuftragsId);
	    
	    if(index!=-1) {
	    	
	    	for(int i=0; i<auftragList.size();i++) {
	    		
	    		if(i!=index) {
	    			
	    			buffer.write(auftragList.get(i).getKontoVonKontonummer()+
	    					 ";"+auftragList.get(i).getKontoZuID()+
	    					 ";"+auftragList.get(i).getUeberweisungsDatum()+
	    					 ";"+auftragList.get(i).getBetrag()+
	    					 ";"+auftragList.get(i).getAuftragsID()+"\n");
	    			
	    			
	    		}
	    		
	    	}
	    	
	    }
	    
	    
	    buffer.close();
	}
}
