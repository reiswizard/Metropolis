package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen;

import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.exceptions.NegativeIncomeException;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.stadtverwaltung.Finanzamt;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.stadtverwaltung.Steuerzahler;
/**
 *
 * @author Herbrandt,Poerling,Phan
 *
 */
public class Buerger extends Mensch implements Steuerzahler {
	/**
	 *
	 * @param name Name
	 * @param vorname Vorname
	 * @param einkommen Einkommen
	 * @param jobs Job
	 * @param alter Alter
	 * @throws NegativeIncomeException kein negatives Einkommen
	 */
    public Buerger(String name, String vorname, long einkommen, String jobs, int alter)
            throws NegativeIncomeException {
        super(name, vorname, einkommen, jobs, alter);

        meldeAnFinanzamt();
    }

    @Override
    public void meldeAnFinanzamt() {
        Finanzamt.setSteuerpflichtige(this);
    }

}
