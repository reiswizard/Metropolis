package organisationen;

import exception.NegativeIncomeException;
import stadtverwaltung.Finanzamt;

public abstract class Organisation extends stadtverwaltung.Einkommenhabende {

	public Organisation() { }

	public Organisation(double einkommen) throws NegativeIncomeException {
		super(einkommen);
		Finanzamt.setOrganisation(this);
	}


}
