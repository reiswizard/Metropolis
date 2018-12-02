package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen;

import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.exceptions.NegativeIncomeException;
/**
 *
 * @author Herbrandt, Poerling, Phan
 *
 */
public abstract class Einwohner extends hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.Person {
    private String vorname;

	/**
	 *
	 * @param name Name
	 * @param vorname Vorname
	 * @param einkommen Einkommen
	 * @throws NegativeIncomeException kein negatives Einkommen
	 */
    public Einwohner(String name, String vorname, long einkommen) throws NegativeIncomeException {
        this(name, einkommen);
        this.vorname = vorname;
    }

    /**
     *
     * @param name Name
     * @param einkommen Einkommen
     * @throws NegativeIncomeException kein negatives Einkommen
     */
    public Einwohner(String name, long einkommen) throws NegativeIncomeException {
        super(name, einkommen);

    }

    /**
     *
     * @return den Namen des Einwohner
     */
    public String getName() {
        if (this.vorname != null) {
            return this.getPersonName() + " " + this.vorname;
        }

        else {
            return this.getPersonName();
        }
    }
}
