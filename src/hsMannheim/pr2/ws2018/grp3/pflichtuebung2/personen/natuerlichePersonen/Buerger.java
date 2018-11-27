/**
 *
 */
package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen;

import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.exceptions.NegativeIncomeException;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.stadtverwaltung.Finanzamt;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.stadtverwaltung.Steuerzahler;

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
