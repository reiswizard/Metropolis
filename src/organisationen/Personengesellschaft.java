/**
 *
 */
package organisationen;

import exception.NegativeIncomeException;
import personen.Buerger;
import stadtverwaltung.Finanzamt;
import stadtverwaltung.Steuerzahler;

/**
 * @author hoang
 *
 */
public class Personengesellschaft extends Unternehmen{
	public Buerger[] inhaber;

	public Personengesellschaft(String name, int gewinn, Buerger...inhaber) throws NegativeIncomeException {
		super(name, gewinn);
		this.inhaber = inhaber;
		meldeAnFinanzamt();
		
	}

    @Override
    public void meldeAnFinanzamt() {
        Finanzamt.setSteuerpflichtige(this);
        
    }



}
