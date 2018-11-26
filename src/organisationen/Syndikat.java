/**
 *
 */
package organisationen;

import personen.Schurke;

/**
 * @author hoang
 *
 */
public class Syndikat extends Organisation{
	public String name;
	public Schurke[] mitglieder;

	public Syndikat(String name, Schurke...mitglieder) {
		this.name = name;
		this.mitglieder = mitglieder;
		koerperschaftsteuerpflichtig = true;
		for ( int i = 0; i < mitglieder.length; i++) {
			this.einkommen = this.einkommen + mitglieder[i].getEinkommen();
		}
	}


	@Override
	public void steuernzahlen() {
		

	}

}
