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
	public double gewinn;

	public Unternehmen(Namen name, double gewinn) {
		this.name = name;
		this.gewinn = gewinn;
		gewerbesteuerpflichtig = true;
	}
}
