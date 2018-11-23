/**
 *
 */
package personen;

import stadtverwaltung.Namen;

/**
 * @author hoang
 *
 */
public class Schurken extends Mutanten{
	public boolean eingesperrt;

	public Schurken(Namen name, int einkommen, String mutation, String superkraft) {
		super(name, einkommen, mutation, superkraft);
		einkommensteuerpflichtig = true;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setSuperkraft(String...superkraft) {
		// TODO Auto-generated method stub
		this.superkraft = superkraft;
	}

	@Override
	public void kaempfe() {
		// TODO Auto-generated method stub

	}

}
