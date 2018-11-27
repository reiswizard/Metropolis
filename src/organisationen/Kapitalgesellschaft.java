/**
 *
 */
package organisationen;

import exception.NegativeIncomeException;
import personen.Buerger;
import personen.Schurke;
import stadtverwaltung.Finanzamt;
import stadtverwaltung.Steuerzahler;

/**
 * @author hoang
 *
 */
public class Kapitalgesellschaft extends Unternehmen{
	public Buerger[] gesellschafter;

	public Kapitalgesellschaft(String name, int gewinn, Buerger...gesellschafter) throws NegativeIncomeException {
		super(name, gewinn);
		this.gesellschafter = gesellschafter;
		meldeAnFinanzamt();
	}

    @Override
    public void meldeAnFinanzamt() {
        Finanzamt.setSteuerpflichtige(this);
        
    }




}
