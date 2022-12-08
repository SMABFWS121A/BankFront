package BankFront;

import kontoBearbeiten.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import MutterKlassen.DauerAuftrag;
import MutterKlassen.Konto;

public class main {

	String kontoFile= "src/konto.txt";
	String auftragFile= "src/auftrag.txt";
	
	
	public void programmStart() throws IOException {
		
		List<Konto>  kontoList= kontoEinlesen();
		List<DauerAuftrag> auftraglist= auftragEinlesen();
		
	    
//	    kontoAusgabe(kontoList);
	    kontoHinzufuegen Hinzufuegen= new kontoHinzufuegen(kontoFile);
	    kontoLoeschen Loeschen= new kontoLoeschen(kontoFile);
	    Hinzufuegen.hinzufuegen(kontoList, "4", "Büller", "14");
	    kontoAusgabe(kontoList);
	    Loeschen.loeschen(kontoList, "4");
	    kontoList= kontoEinlesen();
	    kontoAusgabe(kontoList);
	    
//	    
	    
	}
	
	private List<Konto> kontoEinlesen() throws IOException {
		
		List<Konto>  kontoList= new ArrayList<Konto>();
		FileReader	kontoFileReader = new FileReader(kontoFile);
		String kontoTxt = "";
		
		BufferedReader input = new BufferedReader(kontoFileReader);
		
		kontoTxt= input.readLine();
		String[] arrOfKonto ;
		while (kontoTxt!= null) {
			arrOfKonto = kontoTxt.split(";");
			kontoList.add(new Konto(arrOfKonto[0],arrOfKonto[1],arrOfKonto[2]));
			kontoTxt= input.readLine();
		}
		input.close();
		return kontoList;
		
	}
	
	private List<DauerAuftrag> auftragEinlesen() throws IOException {
		List<DauerAuftrag> auftragList = new ArrayList<DauerAuftrag>();
		FileReader  auftragFileReader= new FileReader(auftragFile);
		String auftragTxt= "";
		
BufferedReader input = new BufferedReader(auftragFileReader);
		
		auftragTxt= input.readLine();
		String[] arrOfAuftrag ;
		while (auftragTxt!= null) {
			arrOfAuftrag = auftragTxt.split(";");
			auftragList.add(new DauerAuftrag(arrOfAuftrag[0],arrOfAuftrag[1],arrOfAuftrag[2],arrOfAuftrag[3],arrOfAuftrag[4]));
			auftragTxt= input.readLine();
		}
		
		input.close();
		return auftragList;
	}
	
	private void kontoAusgabe(List<Konto> kontoList) {
		
		for(int i = 0; i< kontoList.size(); i++ ) {
	    	System.out.println(kontoList.get(i).KontoEigentuemer);
	    }
		
	}
	
	private void auftragAusgabe(List<DauerAuftrag> auftraglist) {
		
		for(int i = 0; i< auftraglist.size(); i++ ) {
	    	System.out.println(auftraglist.get(i).getKontoVonID());
	    }
	}

}
