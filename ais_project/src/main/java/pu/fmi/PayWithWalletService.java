package pu.fmi;

import java.sql.Date;
public class PayWithWalletService {

	static Date myDate;
	public static String pay() {
		
		final User user = new User("name", "pass", "email@test.com", 100f);
		final Transaction transaction = new Transaction(1, myDate, 90f);
		
		float a = user.getWalletFunds();
		float b = transaction.getCost();
		
		return a>b?"Успешна покупка":"Няма достатъчно средства за покупката";

	}
	
}
