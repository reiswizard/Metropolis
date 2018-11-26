package stadtverwaltung;
/**
 *
 */

/**
 * @author hoang
 *
 */
public class Name {
	private String Nachname;
	private String Vornamen;

	public Name(String Name) {
		this.Nachname = Name;
		this.Vornamen = null;
	}
	public Name(String Nachname, String Vornamen) {
		this.Nachname = Nachname;
		this.Vornamen = Vornamen;
	}

	public void setNamen(String Name) {
		this.Nachname = Name;
	}
	public void setNamen(String Nachname, String Vornamen) {
		this.Nachname = Nachname;
		this.Vornamen = Vornamen;
	}

	public String getNamen() {
		if(this.Vornamen==null) {
			return this.Nachname;
		} else {
			return (this.Nachname + " " + this.Vornamen);
		}
	}
}
