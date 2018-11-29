package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.stadtverwaltung;

import java.util.ArrayList;

import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.Person;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.Organisation;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen.Buerger;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen.Schurke;

public class Finanzamt {
	private static ArrayList<Person> steuerpflichtige = new ArrayList<Person>();
	private static Finanzamt instanz = new Finanzamt();

	private Finanzamt() {
	}

	public int berechneEinkommenssteuer(Person person) {
		double einkommenssteuer = 0;
		if (!(person.isEinkommenssteuerpflichtig())) {
			return (int) einkommenssteuer;
		} else {
			if (person.getEinkommen() <= 20000) {
				einkommenssteuer = person.getEinkommen() * 0.1;
			} else if (person.getEinkommen() <= 60000) {
				einkommenssteuer = (person.getEinkommen() - 20000) * 0.25 + 2000;
			} else if (person.getEinkommen() <= 120000) {
				einkommenssteuer = (person.getEinkommen() - 60000) * 0.35 + 12000;
			} else if (person.getEinkommen() > 120000) {
				einkommenssteuer = (person.getEinkommen() - 120000) * 0.5 + 33000;
			}
		}
		return (int) (Math.round(einkommenssteuer));
	}

	public int berechneGewerbesteuer(Person person) {
		double gewerbesteuer = 0;
		if (!(person.isGewerbesteuerpflichtig())) {
			return (int) (Math.round(gewerbesteuer));
		} else {
			gewerbesteuer = person.getEinkommen() * 0.1;
			if ((person.isEinkommenssteuerpflichtig()) && gewerbesteuer >= 1000) {
				gewerbesteuer -= 1000;

			} else {
				gewerbesteuer = 0;
			}
		}
		;

		return (int) (Math.round(gewerbesteuer));
	}

	public int berechneKoerperschaftssteuer(Person person) {
		double koerperschaftsteuer = 0;
		if (!(person.isKoerperschaftsteuerpflichtig())) {
			return (int) koerperschaftsteuer;
		} else {
			koerperschaftsteuer = person.getEinkommen() * 0.25;
		}
		return (int) (Math.round(koerperschaftsteuer));
	}

	public int berechneGesamtsteuerFuerPersonen(Person... personen) {
		double einkommenssteuer = 0;
		for (int i = 0; i < personen.length; i++) {
			einkommenssteuer = einkommenssteuer + berechneEinkommenssteuer(personen[i]);
		}
		double Gewerbesteuer = 0;
		for (int i = 0; i < personen.length; i++) {
			Gewerbesteuer = Gewerbesteuer + berechneGewerbesteuer(personen[i]);
		}
		double koerperschaftsteuer = 0;
		for (int i = 0; i < personen.length; i++) {
			koerperschaftsteuer = koerperschaftsteuer + berechneKoerperschaftssteuer(personen[i]);
		}
		return (int) (Math.round(einkommenssteuer + Gewerbesteuer + koerperschaftsteuer));
	}

	public int berechneSteuerAllerBuerger() {
		double steuer = 0;
		for (int i = 0; i < steuerpflichtige.size(); i++) {
			if (steuerpflichtige.get(i) instanceof Buerger) {
				steuer = steuer + (berechneGesamtsteuerFuerPersonen(steuerpflichtige.get(i)));
			}
		}

		return (int) (Math.round(steuer));
	}

	public int berechneSteuerAllerSchurken() {
		double steuer = 0;
		for (int i = 0; i < steuerpflichtige.size(); i++) {
			if (steuerpflichtige.get(i) instanceof Schurke) {
				steuer = steuer + (berechneGesamtsteuerFuerPersonen(steuerpflichtige.get(i)));
			}
		}

		return (int) (Math.round(steuer));
	}

	public int berechneSteuerAllerOrganisationen() {
		double steuer = 0;
		for (int i = 0; i < steuerpflichtige.size(); i++) {
			if (steuerpflichtige.get(i) instanceof Organisation) {
				steuer = steuer + (berechneGesamtsteuerFuerPersonen(steuerpflichtige.get(i)));
			}
		}

		return (int) (Math.round(steuer));
	}

	public int berechneGesamtsteuer() {
		return berechneSteuerAllerBuerger() + berechneSteuerAllerSchurken() + berechneSteuerAllerOrganisationen();
	}

	public static void setSteuerpflichtige(Person person) {
		Finanzamt.steuerpflichtige.add(person);

	}

	public static ArrayList<Person> getAlleSteuerpflichtigen() {
		return steuerpflichtige;
	}

	public static Finanzamt getInstanz() {
		return instanz;
	}

}