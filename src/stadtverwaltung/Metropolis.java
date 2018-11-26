package stadtverwaltung;
/**
 *
 */

import java.text.DecimalFormat;

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

//	public Finanzamt finanzamt;
//	public Einwohner[] einwohnern;
//	public Organisation[] organisationen;

	public Metropolis() {
	}


	/**
	 * @param args
	 */
	@SuppressWarnings("null")
	public static void main(String[] args) {
		Finanzamt finanzamtMetropolis = new Finanzamt();

		Superheld superman = new Superheld("Superman", 50000, "krypton", new String[]{"superstark", "laseraugen", "unbesiegbar"});
		Superheld ironman = new Superheld("Iron Man", 60000, "krypton", "super");
		Superheld thor = new Superheld("Thor", 80000, "krypton", "super");
		Superheld loki = new Superheld("Loki", 60000, "krypton", "super");
		Superheld spiderman = new Superheld("Spiderman", 30000, "krypton", "super");
		Superheld wonderWoman = new Superheld("Wonder Woman", 40000, "krypton", "super");
		Superheld captainAmerica = new Superheld("Captain America", 90000, "krypton", "super");
		Superheld hulk = new Superheld("Hulk", 20000, "krypton", "super");
		Superheld blackWidow = new Superheld("Black Widow", 180000, "krypton", "super");
		Superheld batman = new Superheld("Batman", 2500000, "krypton", "super");




		Buerger elvisH = new Buerger("elvis", "herbrandt", 13000, "Student", 19);
		Buerger bernS = new Buerger("bern", "scheibner", 20000, "Autist", 23);
		Buerger phillippP = new Buerger("phillipp", "poerkling", 15000, "Pumper", 24);
		Buerger alexR = new Buerger("alex", "remili", 10000, "Zuhälter", 40);
		Buerger mingP = new Buerger("minh", "phan", 17000, "Sovietspion", 30);


		Schurke joker = new Schurke("Joker",80000, "joker", "superjoker");
		Schurke catWoman = new Schurke("Cat Woman", 150000, "joker", "superjoker");
		System.out.println(joker.getName());
		System.out.println(joker.getEinkommen());

		Kapitalgesellschaft r3ich = new Kapitalgesellschaft("R3ICH", 10000, new Buerger[]{mingP, alexR});
		Syndikat dasBoese = new Syndikat("Das Boerse", new Schurke[]{joker});


		for (Buerger i : Finanzamt.getAlleBuerger()) {
			  System.out.println(i.getName());
		}

		double steuer = finanzamtMetropolis.berechneSteuer(elvisH);
		System.out.println("Buerger Elvis zahlt " + steuer + " Metro Dollar an Steuern");

		System.out.println("Schurke Joker zahlt " + finanzamtMetropolis.berechneSteuer(joker) + " Metro Dollar an Steuern");
		System.out.println("Das Boerse zahlt " + finanzamtMetropolis.berechneSteuer(dasBoese) + " Metro Dollar an Steuern");
		System.out.println("Unternehmen R3ICH zahlt " + finanzamtMetropolis.berechneSteuer(r3ich) + " an Steuer");
		System.out.println("Die Stadt nehmt " + finanzamtMetropolis.berechneBuergernsteuer() + " Metro Dollar an Steuern von Buerger ein");
		System.out.println("Die Stadt nehmt  " + finanzamtMetropolis.berechneAlleSteuer() + " Metro Dollar insgesamt an Steuern ein");
	}

}
