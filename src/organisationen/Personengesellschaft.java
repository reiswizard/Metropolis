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
public class Personengesellschaft extends Unternehmen{
	public Buerger[] inhaber;

	public Personengesellschaft(String name, double gewinn, Buerger...inhaber) throws NegativeIncomeException {
		super(name, gewinn);
		this.inhaber = inhaber;
		einkommensteuerpflichtig = true;
		
	}

	@Override
	public void steuernzahlen() {
		
	}

}
