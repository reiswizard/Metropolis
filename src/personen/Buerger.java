/**
 *
 */
package personen;

import java.util.ArrayList;
import java.util.List;

import stadtverwaltung.Finanzamt;

/**
 * @author hoang
 *
 */
public class Buerger extends Menschen {
	private static final List<Buerger> buergern = new ArrayList<>();

	public Buerger(String name, double einkommen, String jobs, int alter) {
		super(name, einkommen, jobs, alter);
		einkommensteuerpflichtig = true;
		Buerger.buergern.add(this);
		Finanzamt.setBuerger(this);
	}

	@Override
	public void steuernzahlen() {
		// TODO Auto-generated method stub
	}

	public static List<Buerger> getAlleBuerger() {
		return buergern;
	}
}
