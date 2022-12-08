package dauerAuftraegeBearbeiten;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import MutterKlassen.DauerAuftrag;

public class dauerAuftragHinzufuege {

	List<DauerAuftrag> auftragList;
	MutterKlassen.DauerAuftrag DauerAuftrag;
	String File;
	
	
	public dauerAuftragHinzufuege(String File) {
		this.File= File;
	}
	
	public void hinzufuegen(List<DauerAuftrag> auftragList,String KontoVonKontonummer, String KontoZuKontonummer, String Datum, String Betrag, String AuftragsId) throws IOException {
		this.DauerAuftrag= new DauerAuftrag( KontoVonKontonummer,  KontoZuKontonummer,  Datum,  Betrag, AuftragsId);
		auftragList.add(DauerAuftrag);
		
	    FileWriter writer = new FileWriter(File,true);  
	    BufferedWriter buffer = new BufferedWriter(writer); 
		
	    buffer.write("\n"+KontoVonKontonummer+";"+KontoZuKontonummer+";"+Datum+";"+Betrag+";");
	    buffer.close();
	}

	
	
}
