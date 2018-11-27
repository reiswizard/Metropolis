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
public class Buerger extends Mensch implements Steuerzahler {
	//private static final List<Buerger> buergern = new ArrayList<>();
	//private String name;

	public Buerger(String nachname, String vorname, int einkommen, String jobs, int alter) throws NegativeIncomeException {
		super(nachname, vorname, einkommen, jobs, alter);
		meldeAnFinanzamt();
	}

//	@Override
//	public void steuernzahlen() {
//		
//	}

//	public static List<Buerger> getAlleBuerger() {
//		return buergern;
//	}
//	public Buerger[] getAlleMutanten() {
//		Buerger[] alleBuergern = new Buerger[buergern.size()];
//		//alleBuergern = buergern.toArray(alleBuergern);
//		return alleBuergern;
//	}


    @Override
    public void meldeAnFinanzamt() {
        // TODO Auto-generated method stub
      //  Buerger.buergern.add(this);
        Finanzamt.setSteuerpflichtige(this);
    }





}
