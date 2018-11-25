package stadtverwaltung;
/**
 *
 */

import java.text.DecimalFormat;

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
		Finanzamt finanzamtMetropolis = new Finanzamt("Finanzamt Metropolis");

		Namen elvis = new Namen("Elsis", "Herbrandt");
		Buerger elvisH = new Buerger(elvis, 10000, "Student", 19);

		Namen bern = new Namen("Bernhardt", "Scheibner");
		Buerger bernS = new Buerger(bern, 20000, "Autist", 23);

		Namen phillipp = new Namen("Phillipp", "Poerkling");
		Buerger phillippP = new Buerger(phillipp, 15000, "Pumper", 24);

		Namen alex = new Namen("Alex", "Remili");
		Buerger alexR = new Buerger(alex, 10000, "Zuhälter", 40);

		Namen minh = new Namen("Ming", "Phan");
		Buerger mingP = new Buerger(minh, 17000, "Sovierspion", 30);

		double steuer = finanzamtMetropolis.berechneSteuer(mingP, elvisH, alexR, bernS);

		System.out.println(elvisH.getEinkommen());
		System.out.println("Buerger Elvis zahlt " + steuer + " Metro Dollar an Steuern");

	}

}
