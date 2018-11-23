package stadtverwaltung;
/**
 *
 */

/**
 * @author hoang
 *
 */
public class Namen {

	private String Nachname;
	private String Vornamen;

	public Namen(String Name) {
		this.Nachname = Name;
		this.Vornamen = null;
	}
	public Namen(String Nachname, String Vornamen) {
		this.Nachname = Nachname;
		this.Vornamen = Vornamen;
	}

	private void setNamen(String Name) {
		this.Nachname = Name;
	}
	private void setNamen(String Nachname, String Vornamen) {
		this.Nachname = Nachname;
		this.Vornamen = Vornamen;
	}

	public String getNamen() {
		if(this.Vornamen==null) {
			return this.Nachname;
		} else {
			return this.Nachname + " " + this.Vornamen;
		}
	}
}
