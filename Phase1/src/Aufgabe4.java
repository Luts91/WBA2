import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Aufgabe4 {
	  private static final String REZEPTE_XML = "./aufgabe3d beispiel.xml";
	  
	  public static void main(String[] args) throws JAXBException, IOException {
		  	JAXBContext context = JAXBContext.newInstance(Rezepte.class);
		    Marshaller m = context.createMarshaller();
		    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		    
		    System.out.println();
		    System.out.println("Output from our XML File: ");
		    Unmarshaller um = context.createUnmarshaller();
		    Rezepte rezepte = (Rezepte) um.unmarshal(new FileReader(REZEPTE_XML));
		    ArrayList<Rezept> list = rezepte.getBooksList();
		    for (Rezepte rezept : list) {
		    	System.out.println("Rezept: " + rezept.getName() 
		    	+ " Zutaten: " + rezept.getZutat()
		    	+ " Arbeitsdauer: " + rezept.getArbeitsdauer()
		    	+ " Schwierigkeit: " + rezept.getSchwierigkeit()
		    	+ " Brenntwert" + rezept.getBrennwert()
		    	);
		    }
		  
		  	

	  }
}
