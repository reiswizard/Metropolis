/**
 *
 */
package personen;

import java.util.ArrayList;
import java.util.List;

import stadtverwaltung.Name;

/**
 * @author hoang
 *
 */
public abstract class Mutant extends Einwohner{
	private static List<Mutant> mutanten = new ArrayList<Mutant>();
	String mutation;
	String[] superkraefte;

	public Mutant(String name, double einkommen, String mutation, String...superkraft) {
		super(name, einkommen);
		this.name = new Name(name);
		this.einkommen = einkommen;
		this.mutation = mutation;
		Mutant.mutanten.add(this);
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
