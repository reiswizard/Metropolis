package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen;

import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.exceptions.NegativeIncomeException;
/**
 * 
 * @author elvis
 *
 */
public abstract class Organisation extends hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.Person {
	/**
	 * 
	 * @param name
	 */
    public Organisation(String name) {
        super(name);
    }
    /**
     * 
     * @param name
     * @param einkommen
     * @throws NegativeIncomeException
     */
    public Organisation(String name, int einkommen) throws NegativeIncomeException {
        super(name, einkommen);
    }
    /**
     * 
     * @return Name der Person
     */
    public String getName() {
        return this.getPersonName();
    }
}
