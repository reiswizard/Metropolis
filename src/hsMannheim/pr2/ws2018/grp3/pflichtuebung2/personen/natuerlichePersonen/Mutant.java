package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen;

import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.exceptions.NegativeIncomeException;

public abstract class Mutant extends Einwohner {
    protected String mutation;
    protected String[] superkraefte;

    public Mutant(String name, int einkommen, String mutation, String... superkraft) throws NegativeIncomeException {
        super(name, einkommen);
        this.mutation = mutation;
        this.superkraefte=superkraft;
    }

    
    public abstract void setSuperkraft(String... superkraft);

    public String[] getSuperkraefte() {
        return this.superkraefte;
    }

}
