package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.stadtverwaltung;
/**
 *
 */

import java.text.DecimalFormat;

import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.exceptions.NegativeIncomeException;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.Kapitalgesellschaft;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.Syndikat;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen.Buerger;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen.Schurke;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen.Superheld;

/**
 * @author hoang
 *
 */
public class Metropolis {
    static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#0");

//  public Finanzamt finanzamt;
//  public Einwohner[] einwohnern;
//  public Organisation[] organisationen;

    public Metropolis() {
    }


    /**
     * @param args
     */
    @SuppressWarnings("null")
    public static void main(String[] args) {
        Finanzamt finanzamtMetropolis = new Finanzamt();
try {
        Superheld superman = new Superheld("Superman", 50000, "krypton", new String[]{"superstark", "laseraugen", "unbesiegbar"});
        Superheld ironman = new Superheld("Iron Man", 60000, "krypton", "super");
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
        
        Schurke joker = new Schurke("Joker",80000, "joker", "superjoker");
        Schurke catWoman = new Schurke("Cat Woman", 150000, "joker", "supsdajoker");

        System.out.println(joker.getName());
        System.out.println(joker.getEinkommen());

        Kapitalgesellschaft r3ich = new Kapitalgesellschaft("R3ICH", 10000, new Buerger[]{mingP, alexR});
        Syndikat dasBoese = new Syndikat("Das Boerse", new Schurke[]{joker});



        double steuer = finanzamtMetropolis.berechneGesamtsteuerFuerPersonen(elvisH);
        System.out.println("Buerger Elvis zahlt " + steuer + " Metro Dollar an Steuern");

        System.out.println("Schurke Joker zahlt " + finanzamtMetropolis.berechneGesamtsteuerFuerPersonen(joker) + " Metro Dollar an Steuern");
        System.out.println("Das Boerse zahlt " + finanzamtMetropolis.berechneGesamtsteuerFuerPersonen(dasBoese) + " Metro Dollar an Steuern");
        System.out.println("Unternehmen R3ICH zahlt " + finanzamtMetropolis.berechneGesamtsteuerFuerPersonen(r3ich) + " an Steuer");
        System.out.println("Die Stadt nehmt " + finanzamtMetropolis.berechneSteuerAllerBuerger() + " Metro Dollar an Steuern von Buerger ein");
        System.out.println("Die Stadt nehmt  " + finanzamtMetropolis.berechneGesamtsteuer() + " Metro Dollar insgesamt an Steuern ein");
}catch (NegativeIncomeException e1) {
    System.err.println("Negatives Einkommen existiert nicht" + e1.getincome());}
}

    }