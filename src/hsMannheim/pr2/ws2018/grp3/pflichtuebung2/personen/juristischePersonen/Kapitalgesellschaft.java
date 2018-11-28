package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen;

import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.exceptions.NegativeIncomeException;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.stadtverwaltung.Finanzamt;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen.Buerger;

public class Kapitalgesellschaft extends Unternehmen {
    private Buerger[] gesellschafter;

    public Kapitalgesellschaft(String name, int gewinn, Buerger... gesellschafter) throws NegativeIncomeException {
        super(name, gewinn);
        this.gesellschafter = gesellschafter;
        meldeAnFinanzamt();

    }

    public Buerger[] getGesellschafter() {
        return gesellschafter;
    }

    public void setGesellschafter(Buerger... gesellschafter) {
        this.gesellschafter = gesellschafter;
    }

    @Override
    public void meldeAnFinanzamt() {
        Finanzamt.setSteuerpflichtige(this);

    }

}
