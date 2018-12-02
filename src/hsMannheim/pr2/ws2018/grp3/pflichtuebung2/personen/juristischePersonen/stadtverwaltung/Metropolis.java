package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.stadtverwaltung;

import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.exceptions.NegativeIncomeException;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.Kapitalgesellschaft;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.Personengesellschaft;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.Syndikat;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen.Buerger;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen.Richter;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen.Schurke;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen.Superheld;
//Simulation der Stadt Metropolis
public class Metropolis {

    /**
     * Konstruktor
     *
     * @author Pörling, Herbrandt, Phan
     * @param
     * @return
     */
    public Metropolis() {
    }

/*  TESTING AREA
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
*/

    public static void main(String[] args) {
        Finanzamt finanzamtMetropolis = Finanzamt.getInstanz();
        try {
            //Superhelden
            Superheld superman = new Superheld("Superman", 100000, "Krypton", "Superstark", "Laseraugen", "Unbesiegbar", "Super");
            Superheld ironman = new Superheld("Iron Man", 100000, "Eisenrüstung", "Superwaffen","Laser", "Super");
            Superheld thor = new Superheld("Thor", 100000, "Donner", "Super", "Blitze");
            Superheld loki = new Superheld("Loki", 100000, "Trickser", "Unsichtbar", "Super");
            Superheld spiderman = new Superheld("Spiderman", 100000, "Spinnensinne", "Superkraft", "Super");
            Superheld wonderWoman = new Superheld("Wonder Woman", 100000, "Super", "Frauenpower");
            Superheld captainAmerica = new Superheld("Captain America", 100000, "Super", "Waffennarr");
            Superheld hulk = new Superheld("Hulk", 20000, "Megastark", "Super");
            Superheld blackWidow = new Superheld("Black Widow", 100000, "Schwarzer Witwe", "Super", "Superdieb");
            Superheld batman = new Superheld("Batman", 100000, "Stark", "Super", "Erfinder", "Reich");

            //Schurken
            Schurke joker = new Schurke("Joker", 50000, "Joker", "Super");
            Schurke catWoman = new Schurke("Cat Woman", 50000, "Super", "Superdieb");
            Schurke blackSpider = new Schurke("Black Spider", 50000, "Junkie", "Super");
            Schurke yTodorov = new Schurke("Yordan Todorov", 50000, "Russische Mig", "Unbesiegbar");
            Schurke poisonIvy = new Schurke("Poison Ivy", 50000, "Naturgift", "Super");

            //Richter
            Richter jDredd = new Richter("Joseph", "Dredd", 50000, 40);
            Richter cAnderson = new Richter("Cassandra", "Anderson", 50000, 50);
            Richter rFreisler = new Richter("Roland", "Freisler", 50000, 52, true);

            //Bürger
            Buerger elvisH = new Buerger("Helblandt", "Elvis", 10000, "Beamter", 19);
            Buerger bernS = new Buerger("Scheibnel", "Beln", 10000, "Autist", 24);
            Buerger phillippP = new Buerger("Poelkling", "Felix", 10000, "Pumper", 23);
            Buerger alexR = new Buerger("Lemili", "Alexandel", 10000, "Zuhälter", 38);
            Buerger mingP = new Buerger("Ling", "Ling", 10000, "Sovietspion", 26);
            Buerger alabaG = new Buerger("Alaba", "Gerhof", 10000, "Peasant", 19);
            Buerger fridaB = new Buerger("Frida", "Barbara", 10000, "Peasant", 20);
            Buerger rikeG = new Buerger("Rike", "German", 10000, "Peasant", 18);
            Buerger alexL = new Buerger("ALexander", "Ludwig", 10000, "Peasant", 25);
            Buerger maxiB = new Buerger("Maximillian", "Black", 10000, "Peasant", 19);
            Buerger pNewman = new Buerger("Paul", "Newman", 10000, "Lehrer", 50);
            Buerger harryE = new Buerger("Harry", "Erikson", 10000, "Peasant", 19);
            Buerger chrisK = new Buerger("Chris", "Kohn", 10000, "Peasant", 25);
            Buerger chrisB = new Buerger("Chris", "Barg", 10000, "Peasant", 19);
            Buerger lilyE = new Buerger("Lilian", "Erhard", 10000, "Peasant", 19);
            Buerger viviR = new Buerger("Vivien", "Royce", 10000, "Peasant", 19);
            Buerger harryP = new Buerger("Harry", "Potter", 10000, "Zauberer", 19);
            Buerger hermyG = new Buerger("Hermione", "Granger", 10000, "Hexe", 19);
            Buerger percyJ = new Buerger("Percy", "Jackson", 10000, "Semigod", 19);
            Buerger jRaynor = new Buerger("James", "Raynor", 10000, "Marshal", 30);
            Buerger tFinlay = new Buerger("Tychus", "Findlay", 10000, "Space-Marines", 25);
            Buerger sKarrigan = new Buerger("Sarah", "Karrigan", 10000, "Queen of Blades", 21);
            Buerger dTrump = new Buerger("Donald", "Trump", 10000, "Weltidiot", 60);
            Buerger dGuy = new Buerger("Doom", "Guy", 10000, "Doomguy", 666);
            Buerger hannahN = new Buerger("Hannah", "Nguyen", 10000, "Ex", 19);
            Buerger lSky = new Buerger("Luke", "Skywalker", 10000, "Weltenretter", 30);
            Buerger rGuzahn = new Buerger("Ryna", "Guszahn", 10000, "Peasant", 19);
            Buerger aSkywalker = new Buerger("Anakin", "Skywalker", 10000, "Darth Vader", 59);
            Buerger oKenobi = new Buerger("Obi-Wan", "Kenobi", 10000, "Sensei", 19);
            Buerger pAmida = new Buerger("Padme", "Amidala", 10000, "Peasant", 19);
            Buerger qJinn = new Buerger("Qui-Gon", "Jinn", 10000, "Peasant", 19);
            Buerger sPalatin = new Buerger("Sheev", "Palatine", 10000, "Peasant", 19);
            Buerger lOrgna = new Buerger("Leila", "Orgnana", 10000, "Prinzessin", 19);
            Buerger rTico = new Buerger("Rose", "Tico", 10000, "Peasant", 19);
            Buerger nRobin = new Buerger("Nico", "Robin", 10000, "Peasant", 19);
            Buerger hSolo = new Buerger("Han", "Solo", 10000, "Peasant", 19);
            Buerger cChewie = new Buerger("Chewbacca", "Wookiees", 10000, "Harrigesetwas", 19);
            Buerger lZorro = new Buerger("Loronoar", "Zorro", 10000, "Schwertkaempfer", 19);
            Buerger pLahm = new Buerger("Phillip", "Lahm", 10000, "Fussballer", 19);
            Buerger lGibbs = new Buerger("Leroy", "Gibbs", 10000, "Agent", 19);
            Buerger jBond = new Buerger("James", "Bond", 10000, "007", 19);
            Buerger tDinozo = new Buerger("Toni", "Dinozo", 10000, "Agent", 19);
            Buerger mReus = new Buerger("Marco", "Reus", 10000, "Fussballer", 19);
            Buerger jCaesar = new Buerger("Julius", "Caesar", 10000, "Eroberer", 19);
            Buerger nUzu = new Buerger("Naruto", "Uzumaki", 10000, "Peasant", 19);
            Buerger rLow = new Buerger("Richard", "Loewe", 10000, "Peasant", 19);
            Buerger sKlaus = new Buerger("Sven", "Klaus", 10000, "Sadist", 50);
            Buerger sLeuchter = new Buerger("Sandro", "Leuchter", 10000, "Prof", 45);
            Buerger santaKlaus = new Buerger("Santa", "Klaus", 10000, "Weihnachtsmann", 2000);
            Buerger leonidasSparta = new Buerger("Leonidas", "von Sparta", 10000, "Koenig", 35);

            //Kapitalgesellschaften
            Kapitalgesellschaft fahrer = new Kapitalgesellschaft("Zimmer", 10000, phillippP, alexR);
            Kapitalgesellschaft bunkerSchwetzingen = new Kapitalgesellschaft("Bunker", 10000, mingP, alexR, elvisH, bernS, phillippP);

            //Personengesellschaften
            Personengesellschaft panzer = new Personengesellschaft("Panzer", 10000, mingP, elvisH, bernS);
            Personengesellschaft profs = new Personengesellschaft("Profs", 10000, sLeuchter, sKlaus);

            //Syndikate
            Syndikat dasBoese = new Syndikat("Das Boese", joker);
            System.out.println("Der Joker hat das Syndikat "+ dasBoese.getName() + " gegründet.\n"
            + dasBoese.getName() + " hat ein Einkommen von: " + dasBoese.getEinkommen() + " Metro-Dollar\n");

            dasBoese.setMitglieder(catWoman, poisonIvy);
            System.out.println("Cat Woman und Poison Ivy sind dem Syndikat " + dasBoese.getName() + " beigetreten.\n"
            + dasBoese.getName() + " hat ein Einkommen von: " + dasBoese.getEinkommen() + " Metro-Dollar\n");

            dasBoese.setMitgliederausgetreten(catWoman);
            System.out.println("Cat Woman ist aus dem Syndikat " + dasBoese.getName() + " ausgetreten.\n"
            + dasBoese.getName() + " hat ein Einkommen von: " + dasBoese.getEinkommen() + " Metro-Dollar\n");

            Syndikat ma2 = new Syndikat("MA2", yTodorov);
            System.out.println("Yordan Todorov hat das Syndikat "+ ma2.getName() + " gegründet.\n"
                    + ma2.getName() + " hat ein Einkommen von: " + ma2.getEinkommen() + " Metro-Dollar\n");


            //Kampfarena Held gewonnen, Schurke verurteilt
            System.out.println("Superman hat einen Kampf mit der Joker angefangen.");
            superman.kaempfe(joker);
            System.out.println("Ist Joker eingesperrt: " + joker.isEingesperrt());
            System.out.println("Schurke Joker wird dem Richter Joseph Dredd vorgeführt: ");
            jDredd.verurteilen(joker);
            System.out.println("Ist Joker schuldig: " + joker.isSchuldig() + "\n");

            //Kampfarena Held verloren
            System.out.println("Spiderman hat einen Kampf mit Cat Woman angefangen.");
            spiderman.kaempfe(catWoman);
            System.out.println("Ist Cat Woman eingesperrt: " + catWoman.isEingesperrt() + "\n");

            //Kampfarena Held gewonnen, korrupte Richter vewrurteilt Schurke nicht
            System.out.println("Spiderman hat einen Kampf mit Poison Ivy angefangen.");
            spiderman.kaempfe(poisonIvy);
            System.out.println("Ist Poison Ivy eingesperrt: " + joker.isEingesperrt());
            System.out.println("Schurke Poison Ivy wird dem Richter Roland Freisler vorgeführt: ");
            rFreisler.verurteilen(poisonIvy);
            System.out.println("Ist Poison Ivy schuldig: " + poisonIvy.isSchuldig());
            System.out.println("Ist Poison Ivy eingesperrt: " + poisonIvy.isEingesperrt() + "\n");



            //Finanzamtding
            //Steueraufkommen
            System.out.println("Steueraufkommen aller Schurken: " + finanzamtMetropolis.berechneSteuerAllerSchurken() + " Metro-Dollar");
            System.out.println("Steueraufkommen aller Buerger: " + finanzamtMetropolis.berechneSteuerAllerBuerger() + " Metro-Dollar");
            System.out.println("Steueraufkommen aller Syndikate: " + finanzamtMetropolis.berechneSteuerAllerSyndikate() + " Metro-Dollar");
            System.out.println("Steueraufkommen aller Kapitalgesellschaften: " + finanzamtMetropolis.berechneSteuerAllerKapitalgesellschaft() + " Metro-Dollar");
            System.out.println("Steueraufkommen aller Personengesellschaften: " + finanzamtMetropolis.berechneSteuerAllerPersonengesellschaft() + " Metro-Dollar");
            System.out.println("Steueraufkommen aller in Metropolis tätigen Organisationen: " + finanzamtMetropolis.berechneSteuerAllerOrganisationen() + " Metro-Dollar");
            System.out.println("Das Finanzamt von Metropolis nehmt insgesamt: " + finanzamtMetropolis.berechneGesamtsteuer() + " Metro-Dollar an Steuern ein.");

        } catch (NegativeIncomeException e1) {
            System.err.println("Negatives Einkommen existiert nicht" + e1.getincome());
        }
    }

}
