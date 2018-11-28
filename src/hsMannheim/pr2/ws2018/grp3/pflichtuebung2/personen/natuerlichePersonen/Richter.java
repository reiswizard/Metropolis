package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen;

import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.exceptions.NegativeIncomeException;

public class Richter extends Mensch {
    private boolean korrupt;

    public boolean isKorrupt() {
        return korrupt;
    }

    public void setKorrupt(boolean korrupt) {
        this.korrupt = korrupt;
    }

    /**
     * @throws NegativeIncomeException
     *
     */
    public Richter(String name, String vorname, int einkommen, int alter) throws NegativeIncomeException {
        super(name, vorname, einkommen, "Richter", alter);
        this.korrupt = false;

    }

    public Richter(String name, String vorname, int einkommen, int alter, boolean korrupt)
            throws NegativeIncomeException {
        this(name, vorname, einkommen, alter);
        this.korrupt = korrupt;

    }

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
