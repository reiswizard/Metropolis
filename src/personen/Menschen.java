/**
 *
 */
package personen;

/**
 * @author hoang
 *
 */
public abstract class Menschen extends Einwohner {
	protected String jobs;
	protected int alter;

	public Menschen(String name, double einkommen, String jobs, int alter) {
		super(name, einkommen);
		this.jobs = jobs;
		this.alter = alter;
		// TODO Auto-generated constructor stub
	}
}
