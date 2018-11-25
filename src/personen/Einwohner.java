/**
 *
 */
package personen;

/**
 * @author hoang
 *
 */
public abstract class Einwohner extends stadtverwaltung.Einkommenhabenden {
	public String name;
	public double einkommen;

	public Einwohner(String name, double einkommen) {
		super(einkommen);
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
