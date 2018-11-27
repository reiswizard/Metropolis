/**
 *
 */
package personen;

import exception.NegativeIncomeException;

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
