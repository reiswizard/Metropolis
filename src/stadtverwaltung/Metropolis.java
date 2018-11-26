package stadtverwaltung;
/**
 *
 */

import java.text.DecimalFormat;

import exception.NegativeIncomeException;
import organisationen.Kapitalgesellschaft;
import organisationen.Syndikat;
import personen.Buerger;
import personen.Schurke;
import personen.Superheld;

/**
 * @author hoang
 *
 */
public class Metropolis {
	static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#0");



	public Metropolis() {
	}


	/**
	 * @param args
	 */
	@SuppressWarnings("null")
	public static void main(String[] args) {
		//Finanzamt finanzamtMetropolis = new Finanzamt();
try {
//		Superheld superman = new Superheld("Superman", 50000, "krypton", new String[]{"superstark", "laseraugen", "unbesiegbar"});
//		Superheld ironman = new Superheld("Iron Man", 60000, "krypton", "super");
//		Superheld thor = new Superheld("Thor", 80000, "krypton", "super");
//		Superheld loki = new Superheld("Loki", 60000, "krypton", "super");
//		Superheld spiderman = new Superheld("Spiderman", 30000, "krypton", "super");
//		Superheld wonderWoman = new Superheld("Wonder Woman", 40000, "krypton", "super");
//		Superheld captainAmerica = new Superheld("Captain America", 90000, "krypton", "super");
//		Superheld hulk = new Superheld("Hulk", 20000, "krypton", "super");
//		Superheld blackWidow = new Superheld("Black Widow", 180000, "krypton", "super");
//		Superheld batman = new Superheld("Batman", 2500000, "krypton", "super");




//		Buerger elvisH = new Buerger("Helblandt", "Elvis", 130000, "Beamter", 19);
//		Buerger bernS = new Buerger("Scheibnel", "Beln", 20000, "Autist", 24);
//		Buerger phillippP = new Buerger("Poerkling", "Felix", 15000, "Pumper", 23);
//		Buerger alexR = new Buerger("Remili", "Alexander", 10000, "Zuhälter", 38);
//		Buerger mingP = new Buerger("Ling", "Ling", 17000, "Sovietspion", 26);
//		Buerger schuldner = new Buerger ("sau", "arme",-5, "schuldner", 25);
		
//		Schurke joker = new Schurke("Joker",80000, "joker", "superjoker");
//		Schurke catWoman = new Schurke("Cat Woman", 150000, "joker", "superjoker");

//		System.out.println(joker.getName());
//		System.out.println(joker.getEinkommen());

//		Kapitalgesellschaft r3ich = new Kapitalgesellschaft("R3ICH", 10000, new Buerger[]{mingP, alexR});
//		Syndikat dasBoese = new Syndikat("Das Boerse", new Schurke[]{joker});


//		for (Buerger i : Finanzamt.getAlleBuerger()) {
//			  System.out.println(i.getName());
//		}
//
//		double steuer = finanzamtMetropolis.berechneSteuer(elvisH);
//		System.out.println("Buerger Elvis zahlt " + steuer + " Metro Dollar an Steuern");
//
//		System.out.println("Schurke Joker zahlt " + finanzamtMetropolis.berechneSteuer(joker) + " Metro Dollar an Steuern");
//		System.out.println("Das Boerse zahlt " + finanzamtMetropolis.berechneSteuer(dasBoese) + " Metro Dollar an Steuern");
//		System.out.println("Unternehmen R3ICH zahlt " + finanzamtMetropolis.berechneSteuer(r3ich) + " an Steuer");
//		System.out.println("Die Stadt nehmt " + finanzamtMetropolis.berechneBuergernsteuer() + " Metro Dollar an Steuern von Buerger ein");
//		System.out.println("Die Stadt nehmt  " + finanzamtMetropolis.berechneAlleSteuer() + " Metro Dollar insgesamt an Steuern ein");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Finanzamt.myFinanzamt.getSteuerpflichtige();
    
        Buerger eins = new Buerger("eins", "eins", 1, "lala", 1);
        Buerger zwei = new Buerger("zwei", "zwei", 2, "lala", 2);
        Buerger drei = new Buerger("drei", "drei", 3, "lala", 3);
        Buerger vier = new Buerger("vier", "vier", 4, "lala", 4);
        Buerger fünf = new Buerger("fünf", "fünf", 5, "lala", 5);
		
		Finanzamt neu = new Finanzamt();
		neu.getSteuerpflichtige();
		double steuer=neu.berechneEinkommenssteuer();
		System.out.println(steuer);
		
		
		
}catch (NegativeIncomeException e1) {
	System.err.println("Negatives Einkommen existiert nicht" + e1.getincome());}
}

	}
