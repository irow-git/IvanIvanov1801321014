package pu.fmi;

public class CardInformation {
	
	private String number;
	private String expDate;
	private String cardHolder;
	private String cVV;
	
	public CardInformation() {
		
	}
	
	public CardInformation(String number, String expDate, String cardHolder, String cVV) {
		super();
		this.number = number;
		this.expDate = expDate;
		this.cardHolder = cardHolder;
		this.cVV = cVV;
	}

	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	public String getCardHolder() {
		return cardHolder;
	}
	public void setCardHolder(String cardHolder) {
		this.cardHolder = cardHolder;
	}
	public String getcVV() {
		return cVV;
	}
	public void setcVV(String cVV) {
		this.cVV = cVV;
	}
}
