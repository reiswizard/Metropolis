package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen;

import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.exceptions.NegativeIncomeException;

/**
 *
 * @author Herbrandt,Poerling,Phan
 *
 */
public abstract class Mensch extends Einwohner {
    private String job;
    private int alter;

    /**
     *
     * @param name Name
     * @param vorname Vorname
     * @param einkommen Einkommen
     * @param job Job
     * @param alter Alter
     * @throws NegativeIncomeException kein negatives Einkommen
     */
    public Mensch(String name, String vorname, int einkommen, String job, int alter) throws NegativeIncomeException {
        super(name, vorname, einkommen);
        this.job = job;
        this.alter = alter;

    }

    /**
     *
     * @return job Job
     */
    public String getJob() {
        return job;
    }

    /**
     *
     * @param job Job
     */
    public void setJob(String job) {
        this.job = job;
    }

    /**
     *
     * @return alter Alter
     */
    public int getAlter() {
        return alter;
    }

    /**
     *Alter ist nciht Änderbar
     * @param alter Alter
     */
//    public void setAlter(int alter) {
//        this.alter = alter;
//    }
}
