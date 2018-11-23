/**
 *
 */
package organisationen;

import stadtverwaltung.Namen;

/**
 * @author hoang
 *
 */
public class Personengesellschaften extends Unternehmen{

	public Personengesellschaften(Namen name, double gewinn) {
		super(name, gewinn);
		einkommensteuerpflichtig = true;
		// TODO Auto-generated constructor stub
	}

}
