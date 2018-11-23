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

	public Einwohner(Namen name, double einkommen) {
		super(einkommen);
		this.name = name;
	}
}
