package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen;

import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.exceptions.NegativeIncomeException;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.stadtverwaltung.Finanzamt;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.stadtverwaltung.Steuerzahler;

public class Buerger extends Mensch implements Steuerzahler {

    public Buerger(String name, String vorname, int einkommen, String jobs, int alter)
            throws NegativeIncomeException {
        super(name, vorname, einkommen, jobs, alter);

        meldeAnFinanzamt();
    }

    @Override
    public void meldeAnFinanzamt() {
        Finanzamt.setSteuerpflichtige(this);
    }

}
