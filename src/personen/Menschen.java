/**
 *
 */
package personen;

import stadtverwaltung.Namen;

/**
 * @author hoang
 *
 */
public abstract class Menschen extends Einwohner {
	protected String jobs;
	protected int alter;

	public Menschen(){	}

	public Menschen(Namen name, double einkommen, String jobs, int alter) {
		super(name, einkommen);
		this.jobs = jobs;
		this.alter = alter;
		// TODO Auto-generated constructor stub
	}
}
