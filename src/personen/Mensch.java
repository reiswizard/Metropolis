/**
 *
 */
package personen;

/**
 * @author hoang
 *
 */
public abstract class Mensch extends Einwohner {
	protected String jobs;
	protected int alter;

	public Mensch(String nachname, String vorname, double einkommen, String jobs, int alter) {
		super(nachname, vorname, einkommen);
		this.jobs = jobs;
		this.alter = alter;
		
	}
}
