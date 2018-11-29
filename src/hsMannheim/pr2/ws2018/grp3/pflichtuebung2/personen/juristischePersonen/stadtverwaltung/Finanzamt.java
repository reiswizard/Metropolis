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

    public double berechneEinkommenssteuer(Person person) {
        double einkommenssteuer = 0;
        if (!(person.isEinkommenssteuerpflichtig())) {
            return einkommenssteuer;
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
        return einkommenssteuer;
    }

    public double berechneGewerbesteuer(Person person) {
        double gewerbesteuer = 0;
        if (!(person.isGewerbesteuerpflichtig())) {
            return gewerbesteuer;
        } else {
            gewerbesteuer = person.getEinkommen() * 0.1;
            if ((person.isEinkommenssteuerpflichtig()) && gewerbesteuer <= 1000) {
                gewerbesteuer = -1000;
            }
        }
        return gewerbesteuer;
    }

    public double berechneKoerperschaftssteuer(Person person) {
        double koerperschaftsteuer = 0;
        if (!(person.isKoerperschaftsteuerpflichtig())) {
            return koerperschaftsteuer;
        } else {
            koerperschaftsteuer = person.getEinkommen() * 0.25;
        }
        return koerperschaftsteuer;
    }

    public double berechneGesamtsteuerFuerPersonen(Person... personen) {
        double einkommenssteuer = 0;
        for (int i = 0; i < personen.length; i++) {
            einkommenssteuer = einkommenssteuer + berechneEinkommenssteuer(personen[i]);
        }
        double Gewerbesteuer = 0;
        for (int i = 0; i < personen.length; i++) {
            Gewerbesteuer = Gewerbesteuer + berechneGewerbesteuer(personen[i]);
        }
        double Koerperschaftsteuer = 0;
        for (int i = 0; i < personen.length; i++) {
            Koerperschaftsteuer = Koerperschaftsteuer + berechneKoerperschaftssteuer(personen[i]);
        }
        return (einkommenssteuer + Gewerbesteuer + Koerperschaftsteuer);
    }

    public double berechneSteuerAllerBuerger() {
        double steuer = 0;
        for (int i = 0; i < steuerpflichtige.size(); i++) {
            if (steuerpflichtige.get(i) instanceof Buerger) {
                steuer = steuer + (berechneGesamtsteuerFuerPersonen(steuerpflichtige.get(i)));
            }
        }

        return steuer;
    }

    public double berechneSteuerAllerSchurken() {
        double steuer = 0;
        for (int i = 0; i < steuerpflichtige.size(); i++) {
            if (steuerpflichtige.get(i) instanceof Schurke) {
                steuer = steuer + (berechneGesamtsteuerFuerPersonen(steuerpflichtige.get(i)));
            }
        }

        return steuer;
    }

    public double berechneSteuerAllerOrganisationen() {
        double steuer = 0;
        for (int i = 0; i < steuerpflichtige.size(); i++) {
            if (steuerpflichtige.get(i) instanceof Organisation) {
                steuer = steuer + (berechneGesamtsteuerFuerPersonen(steuerpflichtige.get(i)));
            }
        }

        return steuer;
    }

    public double berechneGesamtsteuer() {
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