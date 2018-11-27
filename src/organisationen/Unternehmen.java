/**
 *
 */
package organisationen;

import java.util.ArrayList;
import java.util.List;

import exception.NegativeIncomeException;
import stadtverwaltung.Steuerzahler;

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
