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
	public Richter(boolean korrupt) {
		this.korrupt = korrupt;
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
