package stadtverwaltung;

import organisationen.Syndikat;
import organisationen.Unternehmen;
import personen.Buerger;
import personen.Schurken;

/**
 *
 */

/**
 * @author hoang
 *
 */
public class Finanzamt {
	public String name;
	//in Liste umwandeln und setter in den Constructoren von genannten Klassen erschaffen
	private static Buerger[] steuerzahlendeBuerger;
	private static Schurken[] steuerzahlendeSchurken;
	private static Syndikat[] steuerzahlendeSyndikate;
	private static Unternehmen[] steuerzahlendeUnternehmen;



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