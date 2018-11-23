/**
 *
 */
package personen;

/**
 * @author hoang
 *
 */
public class Buerger extends Menschen {

	public Buerger() {	}

	public Buerger(String jobs) {
		einkommensteuerpflichtig = true;
		this.jobs = jobs;
	}

	@Override
	public void steuernzahlen() {
		// TODO Auto-generated method stub

	}
}
