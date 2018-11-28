package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen;

import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.exceptions.NegativeIncomeException;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.stadtverwaltung.Finanzamt;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.stadtverwaltung.Steuerzahler;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen.Schurke;

public class Syndikat extends Organisation implements Steuerzahler {

    private Schurke[] mitglieder;

    public Syndikat(String name, Schurke... mitglieder) throws NegativeIncomeException {
        super(name);
        this.mitglieder = mitglieder;
        for (int i = 0; i < mitglieder.length; i++) {
            // this.einkommen+=mitglieder[i].getEinkommen();
            this.setEinkommen(getEinkommen() + mitglieder[i].getEinkommen());

        }

        meldeAnFinanzamt();

    }

    public Schurke[] getMitglieder() {
        return mitglieder;
    }

    public void setMitglieder(Schurke... mitglieder) {
        this.mitglieder = mitglieder;
    }

    @Override
    public void meldeAnFinanzamt() {
        Finanzamt.setSteuerpflichtige(this);

    }

}
