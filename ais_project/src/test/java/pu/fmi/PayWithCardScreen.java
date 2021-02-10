package pu.fmi;

public class PayWithCardScreen {
	
	private String number;
	private String expDate;
	private String cardHolder;
	private String cVV;
	private String message;

	public void navigateToMe() {
		System.out.println("Екрана за покупка с карта е отворен");
		
	}

	public void setCardNumber(String number) {
		this.number = number;
		
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	
	public void setCardHolder(String cardHolder) {
		this.cardHolder = cardHolder;
		
	}

	public void setCardCVV(String cVV) {
		this.cVV = cVV;
	}

	public void clickBuyBtn() {
		message = PayWithCardService.pay(number, expDate, cardHolder, cVV);
		
	}

	public Object getRegisterMessage() {
		return message;
	}


}
