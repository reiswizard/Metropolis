package stadtverwaltung;
/**
 *
 */

import java.text.DecimalFormat;

import organisationen.Organisation;
import personen.Einwohner;

/**
 * @author hoang
 *
 */
public class Metropolis {
	static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#,##0.00");

	public Finanzamt finanzamt;
	public Einwohner[] einwohnern;
	public Organisation[] organisationen;

	public Metropolis() { }


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String X = "Superman";
		Namen superheld = new Namen("Batman", "Klark");
		System.out.println(superheld.getNamen());
	}

}
