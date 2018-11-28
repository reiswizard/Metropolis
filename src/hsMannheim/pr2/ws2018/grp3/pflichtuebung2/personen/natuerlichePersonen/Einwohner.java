package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen;

import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.exceptions.NegativeIncomeException;

public abstract class Einwohner extends hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.Person {
    private String vorname;

    public Einwohner(String name, String vorname, int einkommen) throws NegativeIncomeException {
        this(name, einkommen);
        this.vorname = vorname;
    }

    public Einwohner(String name, int einkommen) throws NegativeIncomeException {
        super(name, einkommen);

    }

    public String getName() {
        if (this.vorname != null) {
            return this.getPersonName() + " " + this.vorname;
        }

        else {
            return this.getPersonName();
        }
    }
}
