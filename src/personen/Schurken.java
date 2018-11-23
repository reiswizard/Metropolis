/**
 *
 */
package personen;

import java.util.Arrays;
import java.util.List;

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
	//Jedoch nur mit ein durch konstruktor
	public void setSuperkraft(String...superkraft) {
		// TODO Auto-generated method stub
		this.superkraefte = superkraft;
	}

	@SuppressWarnings("unlikely-arg-type")
	public void kaempfe(Superhelden superheld) {
		List<String> superkraefteliste = Arrays.asList(superheld.getSuperkraefte());
		// verloren
		if(superkraefteliste.contains(this.getSuperkraefte())) {
			this.setEingesperrt(true);
        } else {
		// gewonnen
        	System.out.println("Schurke hat den Kampf gewonnen und macht sich triumphal davon");
        }
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
