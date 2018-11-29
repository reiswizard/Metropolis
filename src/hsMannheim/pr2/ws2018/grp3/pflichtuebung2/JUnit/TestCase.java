package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.JUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.exceptions.NegativeIncomeException;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.Kapitalgesellschaft;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.Personengesellschaft;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.Syndikat;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.stadtverwaltung.Finanzamt;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen.Buerger;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen.Richter;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen.Schurke;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen.Superheld;

class TestCase {
TestCase()throws NegativeIncomeException{}
	  

	Finanzamt dasAmt = Finanzamt.getInstanz();
		
	   Buerger elvisH = new Buerger("Helblandt", "Elvis", 130000, "Beamter", 19); 
	     Buerger bernS = new Buerger("Scheibnel", "Beln", 20000, "Autist", 24);
	     Buerger phillippP = new Buerger("Poerkling", "Felix", 15000, "Pumper", 23);
	     Buerger alexR = new Buerger("Remili", "Alexander", 10000, "Zuhälter", 38);
	     Buerger mingP = new Buerger("Ling", "Ling", 17000, "Sovietspion", 26);

	     Richter dredd = new Richter ("Dredd","Judge",50000,36,false);
	     
	     Schurke joker = new Schurke("Joker", 80000, "joker", "superstark");
         Schurke catWoman = new Schurke("Cat Woman", 150000, "joker", "supsdajoker");

	     Superheld superman = new Superheld("Superman", 50000, "krypton", "superstark", "laseraugen", "unbesiegbar");
         Superheld ironman = new Superheld("Iron Man", 60000, "krypton", "super");
		
		Kapitalgesellschaft testKG = new Kapitalgesellschaft("DieKG", 20000, bernS,elvisH);
		Personengesellschaft testPG = new Personengesellschaft("DiePG",9000,elvisH);
		Syndikat testSY = new Syndikat("Das Syndikat",joker,catWoman);
	 
	 @Test
	 void testKoerperschaftssteuer()  {
		 assertEquals(5000,dasAmt.berechneKoerperschaftssteuer(testKG));
	
	}
	 @Test
	 void testEinkommenssteuer() {
		 assertEquals(38000,dasAmt.berechneEinkommenssteuer(elvisH));
	 }
	 @Test
	 void testGewerbesteuer() {
		 assertEquals(0,dasAmt.berechneGewerbesteuer(testPG));
		 	
	 }
	 
	 @Test
	 void testGesamtsteuer() {
		 assertEquals(523800,dasAmt.berechneGesamtsteuer());
		 
	 }
	 
	 @Test
	 void kampfHeldSchurke() {
		 superman.kaempfe(joker);
		 //assertEquals(true,joker.isEingesperrt());
	 System.out.println(joker.isEingesperrt());
	 }
	 
	 //@Test
	// void kampfSchurkeHeld() {
		// joker.kaempfe(superman);
		 //assertEquals(true,joker.isEingesperrt());
	// }
	 
	 public static void main(String args[]) throws NegativeIncomeException {
		 TestCase myTest = new TestCase();
		 myTest.testKoerperschaftssteuer();
		 myTest.testEinkommenssteuer();
		 myTest.testGewerbesteuer();
		 myTest.testGesamtsteuer();
		 myTest.kampfHeldSchurke();
		// myTest.kampfSchurkeHeld();
	 }
	 
	 
}
