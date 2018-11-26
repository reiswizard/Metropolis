/**
 *
 */
package organisationen;

import personen.Schurke;
import stadtverwaltung.Gewerbesteuer;
import stadtverwaltung.Koerperschaftssteuer;

/**
 * @author hoang
 *
 */
public class Syndikat implements Koerperschaftssteuer, Gewerbesteuer{
	public String name;
	public Schurke[] mitglieder;
    private double einkommen;

	public Syndikat(String name, Schurke...mitglieder) {
		this.name = name;
		this.mitglieder = mitglieder;
		for ( int i = 0; i < mitglieder.length; i++) {
			this.einkommen = this.einkommen + mitglieder[i].getEinkommen();
		}
	}




    @Override
    public double getEinkommen() {
        // TODO Auto-generated method stub
        return this.einkommen;
    }

}
