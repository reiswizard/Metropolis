package stadtverwaltung;
/**
 *
 */

/**
 * @author hoang
 *
 */
public class Finanzamt {



	public double steuerErhebung(double Einkommen, boolean steuerpflichtig) {
		if(steuerpflichtig) {
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
		} else {
			Einkommen = 0;
		}
		return Einkommen;
	}
}