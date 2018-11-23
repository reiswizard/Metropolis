/**
 *
 */
package personen;

import stadtverwaltung.Namen;

/**
 * @author hoang
 *
 */
public abstract class Einwohner extends stadtverwaltung.Einkommenhabenden {
	public Namen name;
	public double einkommen;

	public Einwohner(){	}

	public Einwohner(Namen name, double einkommen) {
		this.name = name;
		this.einkommen = einkommen;
	}
}
