/**
 *
 */
package personen;

import java.util.ArrayList;
import java.util.List;

import exception.NegativeIncomeException;
import stadtverwaltung.Finanzamt;
import stadtverwaltung.*;

/**
 * @author hoang
 *
 */
public class Buerger extends Mensch implements Einkommenssteuer {
	private String name;

	public Buerger(String nachname, String vorname, double einkommen, String jobs, int alter) throws NegativeIncomeException {
		super(nachname, vorname, einkommen, jobs, alter);
		Finanzamt.steuerpflichtige.add(this);
	}

    @Override
    public double getEinkommen() {
        // TODO Auto-generated method stub
        return this.einkommen;
    }
    
    public String getName() {
        return this.getName();
    }





}
