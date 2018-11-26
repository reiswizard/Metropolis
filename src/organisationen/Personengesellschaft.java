/**
 *
 */
package organisationen;

import exception.NegativeIncomeException;
import personen.Buerger;
import stadtverwaltung.Einkommenssteuer;

/**
 * @author hoang
 *
 */
public class Personengesellschaft extends Unternehmen implements Einkommenssteuer{
	public Buerger[] inhaber;

	public Personengesellschaft(String name, double gewinn, Buerger...inhaber) throws NegativeIncomeException {
		super(name, gewinn);
		this.inhaber = inhaber;

}
	
    @Override
    public double getEinkommen() {
        // TODO Auto-generated method stub
        return this.getEinkommen();
    }
}
