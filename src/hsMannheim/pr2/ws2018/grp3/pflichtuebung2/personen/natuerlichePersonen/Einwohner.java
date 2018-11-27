/**
 *
 */
package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.natuerlichePersonen;

import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.exceptions.NegativeIncomeException;

/**
 * @author hoang
 *
 */
public abstract class Einwohner extends hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.Person {
	public String name;
	public String vorname;
	public int einkommen;

	public Einwohner() { }

	public Einwohner(String vorname, String name, int einkommen) throws NegativeIncomeException {
		super(einkommen);
		this.name = name;
		this.vorname =vorname;
	}

	public Einwohner(String name, int einkommen) throws NegativeIncomeException {
		super(einkommen);
		this.name = name;
		
	}
	
	

	public String getName() {
		if (vorname!=null) {
		return name+" "+vorname;
		}
		
		else {
			return name;
		}
	}
}
