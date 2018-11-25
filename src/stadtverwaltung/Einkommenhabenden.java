/**
 *
 */
package stadtverwaltung;

/**
 * @author hoang
 *
 */
public abstract class Einkommenhabenden {
	protected boolean einkommensteuerpflichtig;
	protected boolean gewerbesteuerpflichtig;
	protected boolean koerperschaftsteuerpflichtig;
	protected double einkommen;

	public Einkommenhabenden() { }


	public Einkommenhabenden(double einkommen) {
		this.einkommen = einkommen;
	}

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

	public double getEinkommensteuer(Einkommenhabenden...steuerpflichtige) {

		return 0;
	}

	public double getGewerbesteuer() {

		return 0;
	}

	public double getKoerperschaftsteuer() {

		return 0;
	}

	public double berechneEinkommensteuer(Einkommenhabenden personen) {
		double Einkommensteuer = 0;
		if(!(personen.getEinkommensteuerpflichtig())) {
			return Einkommensteuer;
		} else {
			if(personen.getEinkommen()<=20000) {
				Einkommensteuer = personen.getEinkommen()*0.1;
			}
			else if(personen.getEinkommen()<=60000) {
				Einkommensteuer = (personen.getEinkommen()-20000)*0.25+2000;
			}
			else if(personen.getEinkommen()<=120000) {
				Einkommensteuer = (personen.getEinkommen()-60000)*0.35+12000;
			}
			else if(personen.getEinkommen()>200000) {
				Einkommensteuer = (personen.getEinkommen()-120000)*0.5+33000;
			}
		}
		return Einkommensteuer;
	}

	public double berechneGewerbesteuer(Einkommenhabenden personen) {
		double Gewerbesteuer = 0;
		if(!(personen.getGewerbesteuerpflichtig())) {
			return Gewerbesteuer;
		} else {
			Gewerbesteuer = personen.getEinkommen()*0.1;
			if ((personen.getEinkommensteuerpflichtig()) && Gewerbesteuer<=1000) {
				Gewerbesteuer=-1000;
			}
		}
		return Gewerbesteuer;
	}

	public double berechneKoerperschaftsteuer(Einkommenhabenden personen) {
		double Koerperschaftsteuer = 0;
		if(!(personen.getKoerperschaftsteuerpflichtig())) {
			return Koerperschaftsteuer;
		} else {
			Koerperschaftsteuer = personen.getEinkommen()*0.25;
		}
		return Koerperschaftsteuer;
	}

}
