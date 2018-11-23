/**
 *
 */
package organisationen;

import stadtverwaltung.Namen;

/**
 * @author hoang
 *
 */
public abstract class Unternehmen extends Organisation{
	public Namen name;

	public Unternehmen(Namen name) {
		this.name = name;
	}

}
