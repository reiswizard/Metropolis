package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen;

import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.exceptions.NegativeIncomeException;

public abstract class Mensch extends Einwohner {
    private String job;
    private int alter;

    public Mensch(String name, String vorname, int einkommen, String job, int alter) throws NegativeIncomeException {
        super(name, vorname, einkommen);
        this.job = job;
        this.alter = alter;

    }
    
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }
}
