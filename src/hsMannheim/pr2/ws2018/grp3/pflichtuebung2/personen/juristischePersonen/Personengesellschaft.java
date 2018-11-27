/**
 *
 */
package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen;

import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.exceptions.NegativeIncomeException;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.stadtverwaltung.Finanzamt;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.stadtverwaltung.Steuerzahler;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen.Buerger;

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
