/**
 *
 */
package personen;

import java.util.Arrays;
import java.util.List;

/**
 * @author hoang
 *
 */
public class Superheld extends Mutant{

	public Superheld(String name, double einkommen, String mutation, String...superkraft) {
		super(name, einkommen, mutation, superkraft);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setSuperkraft(String... superkraft) {
		// TODO Auto-generated method stub
		this.superkraefte = superkraft;
	}

	@SuppressWarnings("unlikely-arg-type")
	public void kaempfe(Schurke schurke) {
		List<String> superkraefteliste = Arrays.asList(superkraefte);
		// gewonnen
		if(superkraefteliste.contains(schurke.getSuperkraefte())) {
			schurke.setEingesperrt(true);
        } else {
		// verloren
        	System.out.println("Held wurde besiegt, Schurke ist entkommen.");
        }
	}

	@Override
	public void steuernzahlen() {
		// TODO Auto-generated method stub

	}



}