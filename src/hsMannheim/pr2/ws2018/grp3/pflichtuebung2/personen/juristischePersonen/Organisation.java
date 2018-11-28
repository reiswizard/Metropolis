package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen;

import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.exceptions.NegativeIncomeException;

public abstract class Organisation extends hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.Person {

    public Organisation(String name) {
        super(name);
    }

    public Organisation(String name, int einkommen) throws NegativeIncomeException {
        super(name, einkommen);
    }

    public String getName() {
        return this.getPersonName();
    }
}
