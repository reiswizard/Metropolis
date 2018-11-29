package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.exceptions.NegativeIncomeException;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.*;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.Kapitalgesellschaft;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.stadtverwaltung.Finanzamt;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen.Buerger;
class TestCase {
TestCase()throws NegativeIncomeException{}
	 Finanzamt dasAmt = new Finanzamt(); 
		Buerger elvisH = new Buerger("Helblandt", "Elvis", 130000, "Beamter", 19);
		 
	     Buerger bernS = new Buerger("Scheibnel", "Beln", 20000, "Autist", 24);
	     Buerger phillippP = new Buerger("Poerkling", "Felix", 15000, "Pumper", 23);
	     Buerger alexR = new Buerger("Remili", "Alexander", 10000, "Zuhälter", 38);
	     Buerger mingP = new Buerger("Ling", "Ling", 17000, "Sovietspion", 26);
		
		Kapitalgesellschaft testKG = new Kapitalgesellschaft("DieKG", 20000, bernS,elvisH);
		
	 
	 @Test
	 void testKoerperschaftssteuer()  {
		 assertEquals(5000,dasAmt.berechneKoerperschaftssteuer(testKG));
	
	}
	 @Test
	 void testEinkommenssteuer() {
		 assertEquals(38000,dasAmt.berechneEinkommenssteuer(elvisH));
	 }
	 
	 public static void main(String args[]) throws NegativeIncomeException {
		 TestCase myTest = new TestCase();
		 myTest.testKoerperschaftssteuer();
		 myTest.testEinkommenssteuer();
		 
		 
	 }
	 
	 
}
