/**
 *
 */
package stadtverwaltung;

/**
 * @author hoang
 *
 */
public abstract class Natuerlichepersonen {
	protected boolean einkommensteuerpflichtig;
	protected boolean gewerbesteuerpflichtig;
	protected boolean koerperschaftsteuerpflichtig;
	protected double einkommen;

	public Natuerlichepersonen() { }

	public double getEinkommen() {
		return einkommen;
	}

	public abstract void steuernzahlen();

	public boolean getEinkommensteuerpflichtig() {
		return this.einkommensteuerpflichtig;
	}

	public boolean getGewerbesteuerpflichtig() {
	return this.gewerbesteuerpflichtig;
	}

	public boolean getKoerperschaftsteuerpflichtig() {
	return this.koerperschaftsteuerpflichtig;
	}

	public double getEinkommensteuer(Natuerlichepersonen...steuerpflichtige) {

		return 0;
	}

	public double getGewerbesteuer() {

		return 0;
	}

	public double getKoerperschaftsteuer() {

		return 0;
	}

}
