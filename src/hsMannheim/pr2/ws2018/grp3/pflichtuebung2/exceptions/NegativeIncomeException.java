package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.exceptions;
/**
 *
 * @author Herbrandt, Poerling, Phan
 *
 */
public class NegativeIncomeException extends Exception {

	long income;




	/**
	 *
	 * @param message die Narchicht die ausgegeben wird, wenn die Exception geworfen wird
	 * @param einkommen das Einkommen, falls dieses Negativ ist, wird die Exception geworfen
	 */
	public NegativeIncomeException(String message, long einkommen) {
		super(message);
		this.income =einkommen;
	}

	/**
	 *
	 * @return Einkommen
	 */
	public long getincome() {

		return income;

	}
}
