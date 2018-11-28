package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen;

import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.exceptions.NegativeIncomeException;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.stadtverwaltung.Finanzamt;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen.Buerger;

public class Personengesellschaft extends Unternehmen {
    private Buerger[] inhaber;

    public Personengesellschaft(String name, int gewinn, Buerger... inhaber) throws NegativeIncomeException {
        super(name, gewinn);
        this.inhaber = inhaber;
        meldeAnFinanzamt();

    }

    public Buerger[] getInhaber() {
        return inhaber;
    }

    public void setInhaber(Buerger... inhaber) {
        this.inhaber = inhaber;
    }

    @Override
    public void meldeAnFinanzamt() {
        Finanzamt.setSteuerpflichtige(this);

    }

}
