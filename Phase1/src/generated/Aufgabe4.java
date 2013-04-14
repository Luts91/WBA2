package generated;

import generated.Rezepte.Rezept;
import generated.Rezepte.Rezept.Kommentare.Kommentar;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.transform.stream.StreamSource;

public class Aufgabe4 {
	  private static final String REZEPTE_XML = "src/aufgabe3d beispiel.xml";
	  public static ArrayList<Rezepte.Rezept> rezept;
	  public static Scanner scn = new Scanner(System.in);
	  public static JAXBContext context;
	  
	  public static void main(String[] args) throws JAXBException, IOException {
		  
		  context = JAXBContext.newInstance(Rezepte.class);

	      Unmarshaller um = context.createUnmarshaller();
	      Rezepte rezepte = (Rezepte) um.unmarshal(new StreamSource(new File(REZEPTE_XML)), Rezepte.class).getValue();
	      rezept= (ArrayList<Rezept>) rezepte.getRezept();
	      menu();
	      
	
	  }
	  
	  public static void ausgeben(){
		  for (Rezepte.Rezept r : rezept){
			  System.out.println(r.getName());
			  System.out.println();
			  System.out.println("Zutaten: ");
			  for (Rezepte.Rezept.Zutaten.Zutat z : r.zutaten.getZutat()){
				  System.out.println(z.getMenge() + z.getEinheit() + " " + z.getValue());
			  }
			  System.out.println("Zubereitung: "+r.getZubereitung());
			  System.out.println("Arbeitszeit: "+r.getArbeitszeit());
			  System.out.println("Brennwert: " +r.getBrennwert());
			  System.out.println("Schwierigkeitsgrad: "+ r.getSchwierigkeitsgrad());
			  System.out.println();
			  System.out.println("Kommentare:");
			  for (Rezepte.Rezept.Kommentare.Kommentar k : r.getKommentare().kommentar){
				  System.out.println("von " + k.getUser() + ", um "+ k.getZeit() + ": " + k.getText());
			  }
			  
			  System.out.println("_____________________");
			  System.out.println();
			  
		  }
	  }
	  
	  public static void menu(){
		  System.out.println("1: Rezepte anzeigen");
		  System.out.println("2: Kommentar hinzufügen");
		  
		  switch(scn.nextInt()){
		  case 1: 
			  ausgeben();
			  break;
		  case 2:
			  addComment();
			  break;
		  }
		  
		  menu();
		  
	  }
	  
	  public static void addComment(){
		  ArrayList<Rezepte.Rezept.Kommentare.Kommentar> klist;
		  Rezepte.Rezept.Kommentare.Kommentar k = new Rezepte.Rezept.Kommentare.Kommentar();
		  
		  System.out.println("Nummer des Rezepts eingeben: ");
		  int n =scn.nextInt();
		  
		  if (n>=0 && n<rezept.size()){
			  klist=(ArrayList<Kommentar>) rezept.get(n).getKommentare().kommentar;
			  
			  System.out.println("Name: ");
			  k.setUser(scn.next());
			  System.out.println("Text: ");
			  k.setText(scn.next());
			  
			  GregorianCalendar c = new GregorianCalendar();
		      c.setTime(new Date());

		      XMLGregorianCalendar currGregCal;
		      try {
		    	  currGregCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		    	  k.setZeit(currGregCal);
		      } catch (DatatypeConfigurationException e) {}
		      
		      
		      klist.add(k);
		      
		      //klappt nicht 
		  }
	  }
	  
	  
}
