package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen;

import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.exceptions.NegativeIncomeException;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.stadtverwaltung.Steuerzahler;
/**
 * 
 * @author elvis
 *
 */
public abstract class Unternehmen extends Organisation implements Steuerzahler {

    public Unternehmen(String name, int gewinn) throws NegativeIncomeException {
        super(name, gewinn);
    }
}
