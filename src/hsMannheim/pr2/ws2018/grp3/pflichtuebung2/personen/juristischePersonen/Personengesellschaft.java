package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen;

import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.exceptions.NegativeIncomeException;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.stadtverwaltung.Finanzamt;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen.Buerger;
/**
 * 
 * @author elvis
 *
 */
public class Personengesellschaft extends Unternehmen {
    private Buerger[] inhaber;
    /**
     * 
     * @param name
     * @param gewinn
     * @param inhaber die Inhaber einer Personengesellschaft
     * @throws NegativeIncomeException
     */
    public Personengesellschaft(String name, int gewinn, Buerger... inhaber) throws NegativeIncomeException {
        super(name, gewinn);
        this.inhaber = inhaber;
        meldeAnFinanzamt();

    }
    /**
     * 
     * @return inhaber
     */
    public Buerger[] getInhaber() {
        return inhaber;
    }
    /**
     * 
     * @param inhaber
     */
    public void setInhaber(Buerger... inhaber) {
        this.inhaber = inhaber;
    }
    /**
     *  Steuerpflichtige hinzufügen
     */
    @Override
    public void meldeAnFinanzamt() {
        Finanzamt.setSteuerpflichtige(this);

    }

}
