package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.exceptions;
/**
 *
 * @author Herbrandt, Poerling, Phan
 *
 */
public class NegativeIncomeException extends Exception {

	int income;




	/**
	 *
	 * @param message die Narchicht die ausgegeben wird, wenn die Exception geworfen wird
	 * @param einkommen das Einkommen, falls dieses Negativ ist, wrid die Exception geworfen
	 */
	public NegativeIncomeException(String message, int einkommen) {
		super(message);
		this.income =einkommen;
	}

	/**
	 *
	 * @return Einkommen
	 */
	public int getincome() {

		return income;

	}
}
