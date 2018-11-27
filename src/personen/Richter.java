/**
 *
 */
package personen;

import exception.NegativeIncomeException;

/**
 * @author hoang
 *
 */
public class Richter extends Mensch{
	boolean korrupt;
	/**
	 * @throws NegativeIncomeException 
	 *
	 */
	public Richter(String nachname, String vorname, int einkommen, String jobs, int alter) throws NegativeIncomeException {
		super(nachname, vorname, einkommen, jobs, alter);
		this.korrupt = false;
		this.jobs = "Richter";
		
	}

	public Richter(String nachname, String vorname, int einkommen, String jobs, int alter, boolean korrupt) throws NegativeIncomeException {
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


}
