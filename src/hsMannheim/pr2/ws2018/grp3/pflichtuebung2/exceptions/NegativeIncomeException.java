package hsMannheim.pr2.ws2018.grp3.pflichtuebung2.exceptions;

public class NegativeIncomeException extends Exception {
	
	double income;
	
	
	

	
	public NegativeIncomeException(String message, double einkommen) {
		super(message);
		this.income =einkommen;
	}


	public double getincome() {
		
		return income;
		
	}
}
