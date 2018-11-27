/**
 *
 */
package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen;

import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.exceptions.NegativeIncomeException;
import hsMannheim.pr2.ws2018.grp3.pflichtuebung2.personen.juristischePersonen.stadtverwaltung.Steuerzahler;

/**
 * @author hoang
 *
 */
public abstract class Unternehmen extends Organisation implements Steuerzahler{
	public String name;
	public int gewinn;

	public Unternehmen() { }

	public Unternehmen(String name, int gewinn) throws NegativeIncomeException {
		super(gewinn);
		this.name = name;
		this.gewinn = gewinn;

	}
}
