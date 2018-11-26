/**
 *
 */
package personen;

/**
 * @author hoang
 *
 */
public class Richter extends Mensch{
	boolean korrupt;
	/**
	 *
	 */
	public Richter(String nachname, String vorname, double einkommen, String jobs, int alter) {
		super(nachname, vorname, einkommen, jobs, alter);
		this.korrupt = false;
		this.jobs = "Richter";
		// TODO Auto-generated constructor stub
	}

	public Richter(String nachname, String vorname, double einkommen, String jobs, int alter, boolean korrupt) {
		super(nachname, vorname, einkommen, jobs, alter);
		this.korrupt = korrupt;
		this.jobs = "Richter";
		
	}

	public void verurteilen(Schurke gefangene) {
		if(korrupt) {
			gefangene.setSchuldig(!korrupt);
			gefangene.setEingesperrt(!korrupt);
		} else {
			gefangene.setSchuldig(!korrupt);
			gefangene.setEingesperrt(!korrupt);
		}
	}
	//2ndary function, legacy code, kept for experimental purposes
	/*
	public void verutreilen2(Schurke angeklagter) {
		if(korrupt) {
			angeklagter.setEingesperrt(false);
		}
		else {
			angeklagter.setEingesperrt(true);
		
		}
	}*/

	@Override
	public void steuernzahlen() {
		

	}

}
