package kontoBearbeiten;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import MutterKlassen.Konto;

public class kontoHinzufuegen {
	
	List<Konto> kontoListe;
	Konto konto;
	String File;
	
	
	public kontoHinzufuegen(String File) {
		this.File= File;
	}
	
	public void hinzufuegen(List<Konto> kontoListe,String Nummer,String Name,String Betrag ) throws IOException{
		this.kontoListe= kontoListe;
		this.konto= new Konto(Nummer,Name, Betrag);
		kontoListe.add(konto);
		
	    FileWriter writer = new FileWriter(File,true);  
	    BufferedWriter buffer = new BufferedWriter(writer); 
		
	    buffer.write(Nummer+";"+Name+";"+Betrag+";"+"\n");
	    buffer.close();
	}

	
	
}
