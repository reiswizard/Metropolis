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
		steuerpflichtig = true;
		this.jobs = jobs;
	}
}
