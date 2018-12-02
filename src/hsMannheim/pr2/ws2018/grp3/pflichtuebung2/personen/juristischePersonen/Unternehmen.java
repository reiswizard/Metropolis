package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen;

import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.exceptions.NegativeIncomeException;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.stadtverwaltung.Steuerzahler;
/**
 *
 * @author Herbrandt,Poerling,Phan
 *
 */
public abstract class Unternehmen extends Organisation implements Steuerzahler {
	/**
	 * 
	 * @param name Name
	 * @param gewinn Gewinn
	 * @throws NegativeIncomeException kein negatives Einkommen
	 */
    public Unternehmen(String name, long gewinn) throws NegativeIncomeException {
        super(name, gewinn);
    }
}
