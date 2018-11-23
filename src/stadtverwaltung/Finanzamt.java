package stadtverwaltung;
/**
 *
 */

/**
 * @author hoang
 *
 */
public class Finanzamt {


	public double berechneSteuer(Einkommenhabenden...personen) {
		double Einkommensteuer = 0;
		for ( int i = 0; i < personen.length; i++) {
			Einkommensteuer =+ personen[i].berechneEinkommensteuer(personen[i]);
		}
		double Gewerbesteuer = 0;
		for ( int i = 0; i < personen.length; i++) {
			Gewerbesteuer =+ personen[i].berechneGewerbesteuer(personen[i]);
		}
		double Koerperschaftsteuer = 0;
		for ( int i = 0; i < personen.length; i++) {
			Koerperschaftsteuer =+ personen[i].berechneKoerperschaftsteuer(personen[i]);
		}
		return (Einkommensteuer+Gewerbesteuer+Koerperschaftsteuer);
	}
}