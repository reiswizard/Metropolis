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
		// TODO Auto-generated constructor stub
	}

	@Override
	public void steuernzahlen() {
		// TODO Auto-generated method stub

	}

}