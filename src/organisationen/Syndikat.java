/**
 *
 */
package organisationen;

import personen.Schurke;
import stadtverwaltung.Finanzamt;
import stadtverwaltung.Steuerzahler;

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
