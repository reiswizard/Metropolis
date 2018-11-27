/**
 *
 */
package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen;

import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.exceptions.NegativeIncomeException;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.stadtverwaltung.Finanzamt;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen.Buerger;

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
