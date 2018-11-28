package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.exceptions;

public class NegativeIncomeException extends Exception {
	
	int income;
	
	
	

	
	public NegativeIncomeException(String message, int einkommen) {
		super(message);
		this.income =einkommen;
	}


	public int getincome() {
		
		return income;
		
	}
}
