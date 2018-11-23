/**
 *
 */
package organisationen;

import stadtverwaltung.Namen;

/**
 * @author hoang
 *
 */
public class Kapitalgesellschaften extends Unternehmen{

	public Kapitalgesellschaften(Namen name, double gewinn) {
		super(name, gewinn);
		koerperschaftsteuer = true;
		// TODO Auto-generated constructor stub
	}

}
