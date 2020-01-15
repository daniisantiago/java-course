package model.services;

import java.security.InvalidParameterException;

public interface InterestService {
	
	double getInterestRate();
	
	//para reutilar o metodo
	default double payment(double amount, int months) {
		if(months < 1)
			throw new InvalidParameterException("Months must br greater than zero");
		
		return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
	}
}
