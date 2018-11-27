/**
 *
 */
package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen;

import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.exceptions.NegativeIncomeException;

/**
 * @author hoang
 *
 */
public abstract class Mensch extends Einwohner {
	protected String jobs;
	protected int alter;

	public Mensch(String nachname, String vorname, int einkommen, String jobs, int alter) throws NegativeIncomeException {
		super(nachname, vorname, einkommen);
		this.jobs = jobs;
		this.alter = alter;
		
	}
}
