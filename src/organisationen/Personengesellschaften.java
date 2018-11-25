/**
 *
 */
package organisationen;

import personen.Buerger;

/**
 * @author hoang
 *
 */
public class Personengesellschaften extends Unternehmen{
	public Buerger[] inhaber;

	public Personengesellschaften(String name, double gewinn, Buerger...inhaber) {
		super(name, gewinn);
		this.inhaber = inhaber;
		einkommensteuerpflichtig = true;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void steuernzahlen() {
		// TODO Auto-generated method stub

	}

}
