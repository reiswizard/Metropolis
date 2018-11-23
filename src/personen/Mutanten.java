/**
 *
 */
package personen;

import stadtverwaltung.Namen;

/**
 * @author hoang
 *
 */
public abstract class Mutanten extends Einwohner{
	String mutation;
	String[] superkraefte;

	public Mutanten() {	}

	public Mutanten(Namen name, int einkommen, String mutation, String...superkraft) {
		super(name, einkommen);
		this.mutation = mutation;
	}

	public abstract void setSuperkraft(String...superkraft);

	public String[] getSuperkraefte() {
		return superkraefte;
	}
}
