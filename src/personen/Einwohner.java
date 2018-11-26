/**
 *
 */
package personen;

import exception.NegativeIncomeException;

/**
 * @author hoang
 *
 */
public abstract class Einwohner{
	public String name;
	public String vorname;
	public double einkommen;

	public Einwohner() { }

	public Einwohner(String vorname, String name, double einkommen) throws NegativeIncomeException {
		this.einkommen=einkommen;
		this.name = name;
		this.vorname =vorname;
	}

	public Einwohner(String name, double einkommen) throws NegativeIncomeException {
		this.einkommen=einkommen;
		this.name = name;
		
	}
	
	

    public double getEinkommen() {
        // TODO Auto-generated method stub
        return this.einkommen;
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
