/**
 *
 */
package personen;

import stadtverwaltung.Name;

/**
 * @author hoang
 *
 */
public abstract class Einwohner extends stadtverwaltung.Einkommenhabende {
	public Name name;
	public double einkommen;

	public Einwohner() { }

	public Einwohner(String name, double einkommen) {
		super(einkommen);
		this.name = new Name(name);
	}

	public Einwohner(String nachname, String vorname, double einkommen) {
		super(einkommen);
		this.name = new Name(nachname, vorname);
	}

	public Name getName() {
		return name;
	}
}
