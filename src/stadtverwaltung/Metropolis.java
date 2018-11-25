package stadtverwaltung;
/**
 *
 */

import java.text.DecimalFormat;

import organisationen.Kapitalgesellschaften;
import personen.Buerger;

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
//		Finanzamt finanzamtMetropolis = new Finanzamt("Finanzamt Metropolis");
		Finanzamt finanzamtMetropolis = new Finanzamt();

		Buerger elvisH = new Buerger("elvis", 10000, "Student", 19);
		Buerger bernS = new Buerger("bern", 20000, "Autist", 23);
		Buerger phillippP = new Buerger("phillipp", 15000, "Pumper", 24);
		Buerger alexR = new Buerger("alex", 10000, "Zuhälter", 40);
		Buerger mingP = new Buerger("minh", 17000, "Sovierspion", 30);

		Kapitalgesellschaften r3ich = new Kapitalgesellschaften("R3ICH", 10000, mingP, alexR);


		System.out.println(Finanzamt.getAlleBuerger().size());

		for (Buerger i : Finanzamt.getAlleBuerger()) {
			  System.out.println(i.getName());
			}

		double steuer = finanzamtMetropolis.berechneSteuer(elvisH);
		System.out.println("Buerger Elvis zahlt " + steuer + " Metro Dollar an Steuern");

		System.out.println("R3ICH zahlt " + finanzamtMetropolis.berechneSteuer(r3ich) + " an Steuer");
		System.out.println("Die Stadt nehmt " + finanzamtMetropolis.berechneBuergernsteuer() + " Metro Dollar an Steuern von Buerger ein");
		System.out.println("Die Stadt nehmt  " + finanzamtMetropolis.berechneAlleSteuer() + " Metro Dollar insgesamt an Steuern ein");
	}

}
