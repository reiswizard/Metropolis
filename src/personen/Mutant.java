/**
 *
 */
package personen;

import java.util.ArrayList;
import java.util.List;

import exception.NegativeIncomeException;

/**
 * @author hoang
 *
 */
public abstract class Mutant extends Einwohner{
	String mutation;
	String[] superkraefte;

	public Mutant(String name, double einkommen, String mutation, String...superkraft) throws NegativeIncomeException {
		super(name, einkommen);
		this.name = name;
		this.einkommen = einkommen;
		this.mutation = mutation;
	}

	public abstract void setSuperkraft(String...superkraft);


	public String[] getSuperkraefte() {
		return superkraefte;
	}

    @Override
    public double getEinkommen() {
        // TODO Auto-generated method stub
        return this.einkommen;
    }

}
