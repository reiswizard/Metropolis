/**
 *
 */
package organisationen;

import exception.NegativeIncomeException;
import personen.Buerger;
import stadtverwaltung.Koerperschaftssteuer;

/**
 * @author hoang
 *
 */
public class Kapitalgesellschaft extends Unternehmen implements Koerperschaftssteuer{
	public Buerger[] gesellschafter;

	public Kapitalgesellschaft(String name, double gewinn, Buerger...gesellschafter) throws NegativeIncomeException {
		super(name, gewinn);
		this.gesellschafter = gesellschafter;
		
	}
    @Override
    public double getEinkommen() {
        // TODO Auto-generated method stub
        return this.getEinkommen();
    }

}
