/**
 *
 */
package personen;

import stadtverwaltung.Namen;

/**
 * @author hoang
 *
 */
public class Buerger extends Menschen {

	public Buerger(Namen name, double einkommen, String jobs, int alter) {
		super(name, einkommen, jobs, alter);
		einkommensteuerpflichtig = true;
	}

	@Override
	public void steuernzahlen() {
		// TODO Auto-generated method stub

	}
}
