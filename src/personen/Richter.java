/**
 *
 */
package personen;

/**
 * @author hoang
 *
 */
public class Richter extends Menschen{
	boolean korrupt;
	/**
	 *
	 */
	public Richter(String name, double einkommen, String jobs, int alter, boolean korrupt) {
		super(name, einkommen, jobs, alter);
		this.korrupt = korrupt;
		this.jobs = "Richter";
		// TODO Auto-generated constructor stub
	}

	public void verurteilen(Schurken gefangene) {
		if(korrupt) {
			gefangene.setSchuldig(!korrupt);
			gefangene.setEingesperrt(!korrupt);
		} else {
			gefangene.setSchuldig(!korrupt);
			gefangene.setEingesperrt(!korrupt);
		}
	}

	@Override
	public void steuernzahlen() {
		// TODO Auto-generated method stub

	}

}
