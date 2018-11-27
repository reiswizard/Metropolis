package organisationen;

import exception.NegativeIncomeException;
import stadtverwaltung.Finanzamt;
import stadtverwaltung.Steuerzahler;

public abstract class Organisation extends stadtverwaltung.Person{

	public Organisation() { }

	public Organisation(int einkommen) throws NegativeIncomeException {
		super(einkommen);
	}

	
	
}
