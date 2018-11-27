/**
 *
 */
package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen;

import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.stadtverwaltung.Finanzamt;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.stadtverwaltung.Steuerzahler;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen.Schurke;

/**
 * @author hoang
 *
 */
public class Syndikat extends Organisation implements Steuerzahler {
    public String name;
    public Schurke[] mitglieder;

    public Syndikat(String name, Schurke... mitglieder) {
        this.name = name;
        this.mitglieder = mitglieder;
        for (int i = 0; i < mitglieder.length; i++) {
            this.einkommen = this.einkommen + mitglieder[i].getEinkommen();
        }
        meldeAnFinanzamt();
    }

    @Override
    public void meldeAnFinanzamt() {
        Finanzamt.setSteuerpflichtige(this);

    }

}
