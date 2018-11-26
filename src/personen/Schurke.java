/**
 *
 */
package personen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import exception.NegativeIncomeException;
import stadtverwaltung.Finanzamt;

/**
 * @author hoang
 *
 */
public class Schurke extends Mutant{
	private boolean eingesperrt;
	private boolean schuldig;

	public Schurke(String name, double einkommen, String mutation, String superkraft) throws NegativeIncomeException {
		super(name, einkommen, mutation, superkraft);

		
	}

	@Override
	//Jedoch nur mit ein durch konstruktor
	public void setSuperkraft(String...superkraft) {
		
		this.superkraefte = superkraft;
	}

	@SuppressWarnings("unlikely-arg-type")
	public void kaempfe(Superheld superheld) {
		List<String> superkraefteliste = Arrays.asList(superheld.getSuperkraefte());
		// verloren
		if(superkraefteliste.contains(this.getSuperkraefte())) {
			this.setEingesperrt(true);
        } else {
		// gewonnen
        	System.out.println("Schurke hat den Kampf gewonnen und macht sich triumphal davon");
        }
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

    public double getEinkommen() {
        // TODO Auto-generated method stub
        return this.einkommen;
    }
}
