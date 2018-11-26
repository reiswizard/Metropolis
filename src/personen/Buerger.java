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
public class Buerger extends Mensch {
	private static final List<Buerger> buergern = new ArrayList<>();
	private String name;

	public Buerger(String nachname, String vorname, double einkommen, String jobs, int alter) throws NegativeIncomeException {
		super(nachname, vorname, einkommen, jobs, alter);
		einkommensteuerpflichtig = true;
		Buerger.buergern.add(this);
		Finanzamt.setBuerger(this);
	}

	@Override
	public void steuernzahlen() {
		
	}

//	public static List<Buerger> getAlleBuerger() {
//		return buergern;
//	}
	public Buerger[] getAlleMutanten() {
		Buerger[] alleBuergern = new Buerger[buergern.size()];
		alleBuergern = buergern.toArray(alleBuergern);
		return alleBuergern;
	}

}
