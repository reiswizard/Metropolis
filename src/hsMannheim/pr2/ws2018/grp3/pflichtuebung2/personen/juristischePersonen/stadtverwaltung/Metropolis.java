package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.stadtverwaltung;

import java.util.ArrayList;

import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.exceptions.NegativeIncomeException;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.Person;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.Kapitalgesellschaft;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.Syndikat;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen.Buerger;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen.Einwohner;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen.Mensch;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen.Richter;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen.Schurke;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen.Superheld;

public class Metropolis {

    public Metropolis() {
    }

    public static void printHeroes(ArrayList<Person> arrayList) {
        int array = arrayList.size();
        for (int i = 0; i < array; i++) {
            if (arrayList.get(i) instanceof Superheld) {
                System.out.println(arrayList.get(i).getPersonName());
            }
        }
    }

    public static void printSchurken(ArrayList<Person> arrayList) {
        int array = arrayList.size();
        for (int i = 0; i < array; i++) {
            if (arrayList.get(i) instanceof Schurke) {
                System.out.println(arrayList.get(i).getPersonName());
            }
        }
    }

    public static void printBuerger(ArrayList<Person> arrayList) {
        int array = arrayList.size();
        for (int i = 0; i < array; i++) {
            if (arrayList.get(i) instanceof Buerger) {
                System.out.println(arrayList.get(i).getPersonName());
            }
        }
    }

    public static void main(String[] args) {
        Finanzamt finanzamtMetropolis = Finanzamt.getInstanz();
        try {
            Superheld superman = new Superheld("Superman", 50000, "krypton", "superstark", "laseraugen", "unbesiegbar");
            Superheld ironman = new Superheld("Iron Man", 60000, "krypton", "super","laser");
            Superheld thor = new Superheld("Thor", 80000, "krypton", "super");
            Superheld loki = new Superheld("Loki", 60000, "krypton", "super");
            Superheld spiderman = new Superheld("Spiderman", 30000, "krypton", "super");
            Superheld wonderWoman = new Superheld("Wonder Woman", 40000, "krypton", "super");
            Superheld captainAmerica = new Superheld("Captain America", 90000, "krypton", "super");
            Superheld hulk = new Superheld("Hulk", 20000, "krypton", "super");
            Superheld blackWidow = new Superheld("Black Widow", 180000, "krypton", "super");
            Superheld batman = new Superheld("Batman", 2500000, "krypton", "super");

            Buerger elvisH = new Buerger("Helblandt", "Elvis", 130000, "Beamter", 19);
            Buerger bernS = new Buerger("Scheibnel", "Beln", 20000, "Autist", 24);
            Buerger phillippP = new Buerger("Poerkling", "Felix", 15000, "Pumper", 23);
            Buerger alexR = new Buerger("Remili", "Alexander", 10000, "Zuhälter", 38);
            Buerger mingP = new Buerger("Ling", "Ling", 17000, "Sovietspion", 26);

            Schurke joker = new Schurke("Joker", 80000, "joker", "laseraugen");
            Schurke catWoman = new Schurke("Cat Woman", 150000, "joker", "supsdajoker");
    
            System.out.println(phillippP.getName());
            System.out.println(joker.getName());
            System.out.println(joker.getEinkommen());
            System.out.println(elvisH.getEinkommen());

            Kapitalgesellschaft r3ich = new Kapitalgesellschaft("R3ICH", 10000, new Buerger[] { mingP, alexR });
            Syndikat dasBoese = new Syndikat("Das Boese", new Schurke[] { joker,catWoman });
            System.out.println(dasBoese.getName());

            System.out.println("Buerger Elvis zahlt " + finanzamtMetropolis.berechneEinkommenssteuer(elvisH)
                    + " Metro Dollar an Steuern");
            System.out.println("Buerger Bernd zahlt " + finanzamtMetropolis.berechneEinkommenssteuer(mingP)
            + " Metro Dollar an Steuern");
            System.out.println("Buerger Philipp zahlt " + finanzamtMetropolis.berechneEinkommenssteuer(phillippP)
            + " Metro Dollar an Steuern");
            System.out.println("Buerger Ling zahlt " + finanzamtMetropolis.berechneEinkommenssteuer(bernS)
            + " Metro Dollar an Steuern");
            System.out.println("Buerger Alex zahlt " + finanzamtMetropolis.berechneEinkommenssteuer(alexR)
            + " Metro Dollar an Steuern");

            System.out.println("Schurke Joker zahlt " + finanzamtMetropolis.berechneGesamtsteuerFuerPersonen(joker)
                    + " Metro Dollar an Steuern");
            System.out.println("Schurke catWoman zahlt " + finanzamtMetropolis.berechneGesamtsteuerFuerPersonen(catWoman)
            + " Metro Dollar an Steuern");
            System.out.println("Das Boese zahlt " + finanzamtMetropolis.berechneGesamtsteuerFuerPersonen(dasBoese)
                    + " Metro Dollar an Steuern");
            System.out.println("Unternehmen R3ICH zahlt " + finanzamtMetropolis.berechneGesamtsteuerFuerPersonen(r3ich)
                    + " an Steuer");
            System.out.println("Die Stadt nehmt " + finanzamtMetropolis.berechneSteuerAllerBuerger()
                    + " Metro Dollar an Steuern von Buerger ein");
            System.out.println("Die Stadt nehmt  " + finanzamtMetropolis.berechneGesamtsteuer()
                    + " Metro Dollar insgesamt an Steuern ein");

            System.out.println("___________________________________________________________-");
           // Richter Richterin = new Richter("Rich", "Ter", 1300, 45);
            
            joker.kaempfe(ironman);
            System.out.println(joker.isEingesperrt());
            superman.kaempfe(joker);           
           System.out.println(joker.isEingesperrt());
            
           //System.out.println(joker.getSuperkraefte()[0].toString());
            //joker.setSuperkraft("superstark");
            //System.out.println(joker.getSuperkraefte()[0].toString());
            
          
            
            //joker.kaempfe(superman);
           // superman.setSuperkraft("endlaser");
            System.out.println(superman.getSuperkraefte()[0].toString());
            System.out.println(superman.getSuperkraefte()[1].toString());
            System.out.println(superman.getSuperkraefte()[2].toString());
        } catch (NegativeIncomeException e1) {
            System.err.println("Negatives Einkommen existiert nicht" + e1.getincome());
        }
    }

}
