/**
 *
 */
package organisationen;

import personen.Buerger;

/**
 * @author hoang
 *
 */
public class Kapitalgesellschaft extends Unternehmen{
	public Buerger[] gesellschafter;

	public Kapitalgesellschaft(String name, double gewinn, Buerger...gesellschafter) {
		super(name, gewinn);
		this.gesellschafter = gesellschafter;
		koerperschaftsteuerpflichtig = true;
		
	}

	@Override
	public void steuernzahlen() {
		

	}

}
