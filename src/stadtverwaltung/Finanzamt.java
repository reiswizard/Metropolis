package stadtverwaltung;

import java.util.ArrayList;
import java.util.List;

import organisationen.Organisation;
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
	private static List<Buerger> buergern = new ArrayList<Buerger>();
	private static List<Schurken> schurkern = new ArrayList<Schurken>();
	private static List<Organisation> organisationen = new ArrayList<Organisation>();


	public Finanzamt() {
	}


	public long berechneSteuer(Einkommenhabenden...personen) {
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
//		double steuer = Einkommensteuer+Gewerbesteuer+Koerperschaftsteuer;
		return (long) (Einkommensteuer+Gewerbesteuer+Koerperschaftsteuer);
	}

	public long berechneBuergernsteuer() {
		Buerger[] alleBuergern = new Buerger[buergern.size()];
		alleBuergern = buergern.toArray(alleBuergern);
		return (long) (berechneSteuer(alleBuergern));
	}

	public long berechneSchurkensteuer() {
		Schurken[] alleSchurken = new Schurken[schurkern.size()];
		alleSchurken = schurkern.toArray(alleSchurken);
		return (long) (berechneSteuer(alleSchurken));
	}

	public long berechneOrganisationsteuer() {
		Organisation[] alleOrganisationen = new Organisation[organisationen.size()];
		alleOrganisationen = organisationen.toArray(alleOrganisationen);
		return (long) (berechneSteuer(alleOrganisationen));
	}

	public long  berechneAlleSteuer() {
		return (long) (berechneBuergernsteuer()+berechneSchurkensteuer()+berechneOrganisationsteuer());
		}


	public static void setBuerger(Buerger peasant) {
		Finanzamt.buergern.add(peasant);
	}
	public static List<Buerger> getAlleBuerger() {
		return buergern;
	}

	public static void setSchurken(Schurken schurke) {
		Finanzamt.schurkern.add(schurke);
	}
	public static List<Schurken> getAlleSchurken() {
		return schurkern;
	}

	public static void setOrganisation(Organisation organisation) {
		Finanzamt.organisationen.add(organisation);
	}
	public static List<Organisation> getAlleOrganisation() {
		return organisationen;
	}

}