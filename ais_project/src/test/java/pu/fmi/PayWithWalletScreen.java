package pu.fmi;

public class PayWithWalletScreen {

	private String message;
	
	public void navigateToMe() {
		System.out.println("Екрана за покупка с портфейл е отворен");
		
	}

	public void clickBuyBtn() {
		message = PayWithWalletService.pay();
		
	}

	public Object getRegisterMessage() {
		return message;
	}

}
