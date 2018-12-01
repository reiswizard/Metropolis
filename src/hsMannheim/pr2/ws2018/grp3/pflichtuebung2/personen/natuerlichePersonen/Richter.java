package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen;

import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.exceptions.NegativeIncomeException;
/**
 *
 * @author Herbrandt,Poerling,Phan
 *
 */
public class Richter extends Mensch {
    private boolean korrupt;

    /**
     *
     * @return korrupt, gibt  an ob ein Richter korrupt ist
     */
    public boolean isKorrupt() {
        return korrupt;
    }

    /**
     *
     * @param korrupt Korruption
     */
    public void setKorrupt(boolean korrupt) {
        this.korrupt = korrupt;
    }

    /**
     * @throws NegativeIncomeException kein negatives Einkommen
     *
     */
    public Richter(String name, String vorname, int einkommen, int alter) throws NegativeIncomeException {
        super(name, vorname, einkommen, "Richter", alter);
        this.korrupt = false;

    }

    /**
     *
     * @param name Name
     * @param vorname Vorname
     * @param einkommen Einkommen
     * @param alter Alter
     * @param korrupt Korruption
     * @throws NegativeIncomeException kein negatives Einkommen
     */
    public Richter(String name, String vorname, int einkommen, int alter, boolean korrupt)
            throws NegativeIncomeException {
        this(name, vorname, einkommen, alter);
        this.korrupt = korrupt;

    }

    /**
     * Verurteile einen Schurken
     * Wenn Richter korrupt ist, wird der Schurke freigelassen, ansonsten wird er
     * immer schuldig gesprochen und bleibt frei
     *
     * @author Pörling, Herbrandt, Phan
     * @param Schurke schurke
     * @return void kein return wert
     */
    public void verurteilen(Schurke gefangene) {
        if (korrupt) {
            gefangene.setSchuldig(!korrupt);
            gefangene.setEingesperrt(!korrupt);
        } else {
            gefangene.setSchuldig(!korrupt);
            gefangene.setEingesperrt(!korrupt);
        }
    }
    // 2ndary function, legacy code, kept for experimental purposes
    /*
     * public void verutreilen2(Schurke angeklagter) { if(korrupt) {
     * angeklagter.setEingesperrt(false); } else { angeklagter.setEingesperrt(true);
     *
     * } }
     */

}
