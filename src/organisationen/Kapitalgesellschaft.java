/**
 *
 */
package organisationen;

import exception.NegativeIncomeException;
import personen.Buerger;

/**
 * @author hoang
 *
 */
public class Kapitalgesellschaft extends Unternehmen{
	public Buerger[] gesellschafter;

	public Kapitalgesellschaft(String name, double gewinn, Buerger...gesellschafter) throws NegativeIncomeException {
		super(name, gewinn);
		this.gesellschafter = gesellschafter;
		koerperschaftsteuerpflichtig = true;
		
	}

	@Override
	public void steuernzahlen() {
		

	}

}
