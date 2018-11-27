/**
 *
 */
package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen;

import java.util.ArrayList;
import java.util.List;

import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.exceptions.NegativeIncomeException;

/**
 * @author hoang
 *
 */
public abstract class Mutant extends Einwohner{
	private static List<Mutant> mutanten = new ArrayList<Mutant>();
	String mutation;
	String[] superkraefte;

	public Mutant(String name, int einkommen, String mutation, String...superkraft) throws NegativeIncomeException {
		super(name, einkommen);
		this.name = name;
		this.einkommen = einkommen;
		this.mutation = mutation;
	}

	public abstract void setSuperkraft(String...superkraft);


	public String[] getSuperkraefte() {
		return superkraefte;
	}

	public Mutant[] getAlleMutanten() {
		Mutant[] alleMutanten = new Mutant[mutanten.size()];
		alleMutanten = mutanten.toArray(alleMutanten);
		return alleMutanten;
	}
}
