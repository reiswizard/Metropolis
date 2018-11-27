/**
 *
 */
package personen;

import exception.NegativeIncomeException;

/**
 * @author hoang
 *
 */
public abstract class Einwohner extends stadtverwaltung.Person {
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
