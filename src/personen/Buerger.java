/**
 *
 */
package personen;

import java.util.ArrayList;
import java.util.List;

import stadtverwaltung.Finanzamt;
import stadtverwaltung.Namen;

/**
 * @author hoang
 *
 */
public class Buerger extends Menschen {
	private static final List<Buerger> buergern = new ArrayList<>();
	private Namen names;

//	public Buerger(String name, String vorname, String nachname, double einkommen, String jobs, int alter) {
	public Buerger(String name, double einkommen, String jobs, int alter) {
		super(name, einkommen, jobs, alter);
		einkommensteuerpflichtig = true;
		Buerger.buergern.add(this);
		Finanzamt.setBuerger(this);
//		this.names = new Namen(nachname, vorname);
	}

	@Override
	public void steuernzahlen() {
		// TODO Auto-generated method stub
	}

	public static List<Buerger> getAlleBuerger() {
		return buergern;
	}
}
