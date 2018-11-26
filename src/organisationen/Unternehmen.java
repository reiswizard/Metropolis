/**
 *
 */
package organisationen;

import java.util.ArrayList;
import java.util.List;

import exception.NegativeIncomeException;
import stadtverwaltung.Gewerbesteuer;

/**
 * @author hoang
 *
 */
public abstract class Unternehmen implements Gewerbesteuer{
	public String name;
	public double gewinn;

	public Unternehmen() { }

	public Unternehmen(String name, double gewinn) throws NegativeIncomeException {
		this.name = name;
		this.gewinn = gewinn;
	}

    @Override
    public double getEinkommen() {
        // TODO Auto-generated method stub
        return this.getEinkommen();
    }
}
