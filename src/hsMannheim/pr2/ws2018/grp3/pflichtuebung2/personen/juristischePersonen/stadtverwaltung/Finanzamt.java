package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.stadtverwaltung;

import java.util.ArrayList;

import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.Person;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.Kapitalgesellschaft;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.Organisation;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.Personengesellschaft;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.Syndikat;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen.Buerger;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen.Schurke;
/**
 *
 * @author Herbrandt, Poerling, Phan
 *
 */
public class Finanzamt {
    private static ArrayList<Person> steuerpflichtige = new ArrayList<Person>();
    private static Finanzamt instanz;

    private Finanzamt() {
    }

    /**
     * Berechne Einkommenssteuer für eine Person
     *
     * @author Pörling, Herbrandt, Phan
     * @param Person person
     * @return long einkommenssteuer
     */
    public long berechneEinkommenssteuer(Person person) {
        double einkommenssteuer = 0;
        if (!(person.isEinkommenssteuerpflichtig())) {
            return (long) einkommenssteuer;
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
        return ((long) einkommenssteuer);
    }

/**
 *
 * @param person die Person(juristisch oder natürlich) für die die Gewerbesteuer berechnet werden soll
 * @return die errechnete Gewerbesteuer
 */
    public long berechneGewerbesteuer(Person person) {
        double gewerbesteuer = 0;
        if (!(person.isGewerbesteuerpflichtig())) {
            return (long) ((gewerbesteuer));
        } else {
            gewerbesteuer = person.getEinkommen() * 0.1;
            if ((person.isEinkommenssteuerpflichtig()) && gewerbesteuer >= 1000) {
                gewerbesteuer -= 1000;

            } else {
                gewerbesteuer = 0;
            }
        }
        ;

        return (long) ((gewerbesteuer));
    }

    /**
     *
     * @param person
     * @return
     */
    public long berechneKoerperschaftssteuer(Person person) {
        double koerperschaftsteuer = 0;
        if (!(person.isKoerperschaftsteuerpflichtig())) {
            return (long) koerperschaftsteuer;
        } else {
            koerperschaftsteuer = person.getEinkommen() * 0.25;
        }
        return (long) ((koerperschaftsteuer));
    }

    /**
     *
     * @param personen
     * @return die errechnete Gesamtsteuer
     */
    public long berechneGesamtsteuerFuerPersonen(Person... personen) {
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
        return (long) ((einkommenssteuer + Gewerbesteuer + koerperschaftsteuer));
    }

    //Test
//    public long berechneSteuerAllerVon(Object von) {
//        double steuer = 0;
//        for (int i = 0; i < steuerpflichtige.size(); i++) {
//            if (steuerpflichtige.get(i) instanceof von) {
//                steuer = steuer + (berechneGesamtsteuerFuerPersonen(steuerpflichtige.get(i)));
//            }
//        }
//        return (long) ((steuer));
//    }
//    public String getKlasse() {
//        return this.getClass().getSimpleName();
//    }
    //Testende


    /**
     *
     * @return die Steuer aller Bürger
     */
    public long berechneSteuerAllerBuerger() {
        double steuer = 0;
        for (int i = 0; i < steuerpflichtige.size(); i++) {
            if (steuerpflichtige.get(i) instanceof Buerger) {
                steuer = steuer + (berechneGesamtsteuerFuerPersonen(steuerpflichtige.get(i)));
            }
        }

        return (long) ((steuer));
    }

    /**
     *
     * @return die Steuer aller Schurken
     */
    public long berechneSteuerAllerSchurken() {
        double steuer = 0;
        for (int i = 0; i < steuerpflichtige.size(); i++) {
            if (steuerpflichtige.get(i) instanceof Schurke) {
                steuer = steuer + (berechneGesamtsteuerFuerPersonen(steuerpflichtige.get(i)));
            }
        }

        return (long) ((steuer));
    }

    /**
     *
     * @return Die Steuer aller Syndikate
     */
    public long berechneSteuerAllerSyndikate() {
        double steuer = 0;
        for (int i = 0; i < steuerpflichtige.size(); i++) {
            if (steuerpflichtige.get(i) instanceof Syndikat) {
                steuer = steuer + (berechneGesamtsteuerFuerPersonen(steuerpflichtige.get(i)));
            }
        }

        return (long) ((steuer));
    }

    /**
     *
     * @return Die Steuer aller Kapitalgesellschaft
     */
    public long berechneSteuerAllerKapitalgesellschaft() {
        double steuer = 0;
        for (int i = 0; i < steuerpflichtige.size(); i++) {
            if (steuerpflichtige.get(i) instanceof Kapitalgesellschaft) {
                steuer = steuer + (berechneGesamtsteuerFuerPersonen(steuerpflichtige.get(i)));
            }
        }

        return (long) ((steuer));
    }


    public long berechneSteuerAllerPersonengesellschaft() {
        double steuer = 0;
        for (int i = 0; i < steuerpflichtige.size(); i++) {
            if (steuerpflichtige.get(i) instanceof Personengesellschaft) {
                steuer = steuer + (berechneGesamtsteuerFuerPersonen(steuerpflichtige.get(i)));
            }
        }

        return (long) ((steuer));
    }

    /**
     *
     * @return steuer aller Organisationen
     */
    public long berechneSteuerAllerOrganisationen() {
        double steuer = 0;
        for (int i = 0; i < steuerpflichtige.size(); i++) {
            if (steuerpflichtige.get(i) instanceof Organisation) {
                steuer = steuer + (berechneGesamtsteuerFuerPersonen(steuerpflichtige.get(i)));
            }
        }

        return (long) ((steuer));
    }

    /**
     *
     * @return die Gesamtsteuer
     */
    public long berechneGesamtsteuer() {
        return berechneSteuerAllerBuerger() + berechneSteuerAllerSchurken() + berechneSteuerAllerOrganisationen();
    }

/**
 *
 * @param person
 */
    public static void setSteuerpflichtige(Person person) {
        Finanzamt.steuerpflichtige.add(person);

    }
    /**
     *
     * @return alle Steuerpflichtigen
     */
    public static ArrayList<Person> getAlleSteuerpflichtigen() {
        return steuerpflichtige;
    }

/**
 *
 * @return das Singletion Finanzamt
 */
    public static Finanzamt getInstanz() {
        if (Finanzamt.instanz == null) {
            Finanzamt.instanz = new Finanzamt();
        }
        return instanz;
    }

    /**
     *
     * @param person
     */
    public static void deleteSteuerpflichtige(Person person) {
        Finanzamt.steuerpflichtige.remove(person);

    }

}