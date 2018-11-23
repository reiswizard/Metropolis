/**
 *
 */
package organisationen;

import personen.Schurken;
import stadtverwaltung.Namen;

/**
 * @author hoang
 *
 */
public class Syndikat extends Organisation{
	public Namen name;
	public Schurken[] mitglieder;

	public Syndikat(Namen name, Schurken...mitglieder) {
		this.name = name;
		this.mitglieder = mitglieder;
		koerperschaftsteuerpflichtig = true;
		for ( int i = 0; i < mitglieder.length; i++) {
			this.einkommen = this.einkommen + this.getEinkommen();
		}
	}

	@Override
	public void steuernzahlen() {
		// TODO Auto-generated method stub

	}

}
