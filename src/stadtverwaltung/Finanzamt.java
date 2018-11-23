package stadtverwaltung;
/**
 *
 */

/**
 * @author hoang
 *
 */
public class Finanzamt {
	String name;

	public Finanzamt(String Name) {
		this.name = "Finanzamt Metropolis";
	}


	public double berechneSteuer(Einkommenhabenden...personen) {
		double Einkommensteuer = 0;
		for ( int i = 0; i < personen.length; i++) {
			Einkommensteuer = Einkommensteuer + personen[i].berechneEinkommensteuer(personen[i]);
		}
		double Gewerbesteuer = 0;
		for ( int i = 0; i < personen.length; i++) {
			Gewerbesteuer = Gewerbesteuer + personen[i].berechneGewerbesteuer(personen[i]);
		}
		double Koerperschaftsteuer = 0;
		for ( int i = 0; i < personen.length; i++) {
			Koerperschaftsteuer = Koerperschaftsteuer + personen[i].berechneKoerperschaftsteuer(personen[i]);
		}
		double steuer = Einkommensteuer+Gewerbesteuer+Koerperschaftsteuer;

		return steuer;
	}
}