/**
 *
 */
package personen;

import java.util.ArrayList;
import java.util.List;

import stadtverwaltung.Finanzamt;
import stadtverwaltung.Name;

/**
 * @author hoang
 *
 */
public class Buerger extends Mensch {
	private static final List<Buerger> buergern = new ArrayList<>();
	private Name name;

	public Buerger(String nachname, String vorname, double einkommen, String jobs, int alter) {
		super(nachname, vorname, einkommen, jobs, alter);
		einkommensteuerpflichtig = true;
		Buerger.buergern.add(this);
		Finanzamt.setBuerger(this);
	}

	@Override
	public void steuernzahlen() {
		// TODO Auto-generated method stub
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
