package pu.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PaymentWithWalletSteps {
	
	private PayWithWalletScreen payWithWalletScreen = new PayWithWalletScreen();
	
	@Given("^Потребителят отваря екрана за покупка чрез портфейл$")
	public void openPayWithWalletScreen() throws Throwable {
		payWithWalletScreen.navigateToMe();
	}

	@When("^Натиска бутон за покупка$")
	public void clickBuyBtn() throws Throwable {
	    payWithWalletScreen.clickBuyBtn();
	}

	@Then("^Вижда съобщение \"([^\"]*)\"$")
	public void checkMessage(String message) throws Throwable {
		assertEquals(message, payWithWalletScreen.getRegisterMessage());
	}

}
