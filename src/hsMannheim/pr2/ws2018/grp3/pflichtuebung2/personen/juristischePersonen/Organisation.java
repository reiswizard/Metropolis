package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen;

import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.exceptions.NegativeIncomeException;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.stadtverwaltung.Finanzamt;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.stadtverwaltung.Steuerzahler;

public abstract class Organisation extends hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.Person{

	public Organisation() { }

	public Organisation(int einkommen) throws NegativeIncomeException {
		super(einkommen);
	}

	
	
}
