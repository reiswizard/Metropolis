/**
 *
 */
package organisationen;

import personen.Schurken;

/**
 * @author hoang
 *
 */
public class Syndikat extends Organisation{
	public String name;
	public Schurken[] mitglieder;

	public Syndikat(String name, Schurken...mitglieder) {
//		super(einkommen);
		this.name = name;
		this.mitglieder = mitglieder;
		koerperschaftsteuerpflichtig = true;
		for ( int i = 0; i < mitglieder.length; i++) {
			this.einkommen = this.einkommen + mitglieder[i].getEinkommen();
		}
	}


	@Override
	public void steuernzahlen() {
		// TODO Auto-generated method stub

	}

}
