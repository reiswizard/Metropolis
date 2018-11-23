/**
 *
 */
package stadtverwaltung;

/**
 * @author hoang
 *
 */
public abstract class Steuerpflichtig {
	protected boolean einkommensteuerpflichtig;
	protected boolean gewerbesteuerpflichtig;
	protected boolean koerperschaftsteuer;


	public boolean getSteuerpflichtig() {
		return this.einkommensteuerpflichtig;
	}

	public boolean getGewerbesteuerpflichtig() {
	return this.gewerbesteuerpflichtig;
	}

	public boolean getKoerperschaftsteuer() {
	return this.koerperschaftsteuer;
	}
}
