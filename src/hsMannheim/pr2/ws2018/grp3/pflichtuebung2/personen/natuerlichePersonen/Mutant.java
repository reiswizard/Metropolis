package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen;

import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.exceptions.NegativeIncomeException;
	/**
	 * 
	 * @author Herbandt,Poerling,Phan
	 *
	 */
public abstract class Mutant extends Einwohner {
    protected String mutation;
    protected String[] superkraefte;
    /**
     * 
     * @param name
     * @param einkommen
     * @param mutation
     * @param superkraft
     * @throws NegativeIncomeException
     */
    public Mutant(String name, int einkommen, String mutation, String... superkraft) throws NegativeIncomeException {
        super(name, einkommen);
        this.mutation = mutation;
        this.superkraefte=superkraft;
    }

    /**
     * 
     * @param superkraft
     */
    public abstract void setSuperkraft(String... superkraft);

    public String[] getSuperkraefte() {
        return this.superkraefte;
    }

}
