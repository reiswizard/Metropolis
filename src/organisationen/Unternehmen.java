/**
 *
 */
package organisationen;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hoang
 *
 */
public abstract class Unternehmen extends Organisation{
	public String name;
	public double gewinn;
	private static final List<Unternehmen> unternehmern = new ArrayList<>();

	public Unternehmen() { }

	public Unternehmen(String name, double gewinn) {
		super(gewinn);
		this.name = name;
		this.gewinn = gewinn;
		gewerbesteuerpflichtig = true;
		Unternehmen.unternehmern.add(this);
	}
}
