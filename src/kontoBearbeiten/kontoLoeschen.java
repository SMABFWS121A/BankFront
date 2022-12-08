package kontoBearbeiten;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import MutterKlassen.Konto;
import werkzeuge.indexVonKontonummer;

public class kontoLoeschen {

	List<Konto> kontoList;
	String File;
	int index;
	
	public kontoLoeschen( String File) {
		
		this.File= File;
	}
	
	
	public void loeschen(List<Konto> kontoList,String Kontonummer) throws IOException {
		this.kontoList= kontoList;
	    FileWriter writer = new FileWriter(File);  
	    BufferedWriter buffer = new BufferedWriter(writer);
		indexVonKontonummer IVK= new indexVonKontonummer();
	    index= IVK.IndexVonKontonummer(kontoList, Kontonummer);
	    
	    if(index!=-1) {
	    	
	    	for(int i=0; i<kontoList.size();i++) {
	    		
	    		if(i!=index) {
	    			
	    			buffer.write(kontoList.get(i).KontoNummer+
	    					";"+kontoList.get(i).KontoEigentuemer+
	    					";"+kontoList.get(i).Betrag+";"+"\n");
	    			
	    		}
	    		
	    	}
	    	
	    }
	    
	    
	    buffer.close();
	}
}
