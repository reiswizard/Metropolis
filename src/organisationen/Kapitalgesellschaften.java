/**
 *
 */
package organisationen;

import personen.Buerger;
import stadtverwaltung.Namen;

/**
 * @author hoang
 *
 */
public class Kapitalgesellschaften extends Unternehmen{
	public Buerger[] gesellschafter;

	public Kapitalgesellschaften(Namen name, double gewinn, Buerger...gesellschafter) {
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
