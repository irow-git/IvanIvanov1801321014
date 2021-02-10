package pu.fmi;

import java.util.ArrayList;
import java.util.List;

public class PayWithCardService {
	public static String pay(String number, String expDate, String cardHolder, String cVV){
		
		
		if(null == number || "".equals(number)) {
			return "Липсващ номер на картата";
		}
		if(null == expDate || "".equals(expDate)) {
			return "Липсващ срок на годност";
		}
		if(null == cardHolder || "".equals(cardHolder)) {
			return "Липсващо име на карта";
		}
		if(null == cVV || "".equals(cVV)) {
			return "Липсващо CVV";
		}
		
		final List<dummyBankDB> bankDB = getCards();
		
		boolean dummyResponseFromBank = bankDB.stream().anyMatch(b -> b.getNumber().equals(number));
		
		return dummyResponseFromBank?"Успешна покупка":"Недостатъчни средства или грешни данни";
		
		
	}
		public static List<dummyBankDB> getCards(){
			final dummyBankDB bankDB = new dummyBankDB("4213 3123 5434 4123 3123", "5.2021", "IVANIVANOV", "092");
			ArrayList<dummyBankDB> bankDBs = new ArrayList<dummyBankDB>();
			bankDBs.add(bankDB);
			return bankDBs;
		}

}
