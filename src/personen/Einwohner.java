/**
 *
 */
package personen;



/**
 * @author hoang
 *
 */
public abstract class Einwohner extends stadtverwaltung.Einkommenhabende {
	public String name;
	public String vorname;
	public double einkommen;

	public Einwohner() { }

	public Einwohner(String vorname, String name, double einkommen) {
		super(einkommen);
		this.name = name;
		this.vorname =vorname;
	}

	public Einwohner(String name, double einkommen) {
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
