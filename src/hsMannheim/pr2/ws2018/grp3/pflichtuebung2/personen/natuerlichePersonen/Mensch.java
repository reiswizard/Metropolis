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
     * @param name
     * @param vorname
     * @param einkommen
     * @param job
     * @param alter
     * @throws NegativeIncomeException
     */
    public Mensch(String name, String vorname, int einkommen, String job, int alter) throws NegativeIncomeException {
        super(name, vorname, einkommen);
        this.job = job;
        this.alter = alter;

    }
    /**
     * 
     * @return job
     */
    public String getJob() {
        return job;
    }
    /**
     * 
     * @param job
     */
    public void setJob(String job) {
        this.job = job;
    }
    /**
     * 
     * @return alter
     */
    public int getAlter() {
        return alter;
    }
    /**
     * 
     * @param alter
     */
    public void setAlter(int alter) {
        this.alter = alter;
    }
}
