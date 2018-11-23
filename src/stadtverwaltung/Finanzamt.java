package stadtverwaltung;
/**
 *
 */

/**
 * @author hoang
 *
 */
public class Finanzamt {



	public double erhebeEinkommensteuer(double Einkommen, boolean einkommensteuerpflichtig) {
		if(!einkommensteuerpflichtig) {
			Einkommen = 0;
		} else {
			if(Einkommen<=20000) {
				Einkommen = Einkommen*0.1;
			}
			if(Einkommen<=60000) {
				Einkommen = (Einkommen-20000)*0.25+2000;
			}
			if(Einkommen<=120000) {
				Einkommen = (Einkommen-60000)*0.35+12000;
			}
			if(Einkommen>200000) {
				Einkommen = (Einkommen-120000)*0.5+33000;
			}
		}
		return Einkommen;
	}

	public double erhebeGewerbesteuer(double Einkommen, boolean gewerbesteuerpflichtig, boolean einkommensteuerpflichtig) {
		if(!gewerbesteuerpflichtig) {
			Einkommen = 0;
		} else {
			Einkommen = Einkommen*0.1;
			if (einkommensteuerpflichtig && Einkommen<=1000) {
				Einkommen=-1000;
			}
		}
		return Einkommen;
	}

	public double erhebeKoerperschaftsteuer(double Einkommen, boolean koerperschaftsteuer) {
		if(!koerperschaftsteuer) {
			Einkommen = 0;
		} else {
			Einkommen = Einkommen*0.25;
		}
		return Einkommen;
	}
}