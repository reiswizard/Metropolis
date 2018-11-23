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
	private boolean eingesperrt;
	private boolean schuldig;

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

	@Override
	public void steuernzahlen() {
		// TODO Auto-generated method stub

	}

	public boolean isSchuldig() {
		return schuldig;
	}

	public boolean isEingesperrt() {
		return eingesperrt;
	}

	public void setSchuldig(boolean schuldig) {
		this.schuldig = schuldig;
	}

	public void setEingesperrt(boolean eingesperrt) {
		this.eingesperrt = eingesperrt;
	}
}
