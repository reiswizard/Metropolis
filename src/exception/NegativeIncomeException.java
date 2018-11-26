package exception;

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
