package organisationen;

import stadtverwaltung.Finanzamt;

public abstract class Organisation extends stadtverwaltung.Einkommenhabenden {

	public Organisation() { }

	public Organisation(double einkommen) {
		super(einkommen);
		Finanzamt.setOrganisation(this);
	}


}
