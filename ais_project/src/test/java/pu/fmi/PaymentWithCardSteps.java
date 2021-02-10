package pu.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PaymentWithCardSteps {
	
	private PayWithCardScreen payWithCardScreen = new PayWithCardScreen();
	
	@Given("^Потребителят отваря екрана за покупка чрез дебитна/кредитна карта$")
	public void openPayWithCardScreen() throws Throwable {
		payWithCardScreen.navigateToMe();
	}

	@When("^Въведе номер на картата \"([^\"]*)\"$")
	public void addCardNumber(String number) throws Throwable {
		payWithCardScreen.setCardNumber(number);
	}

	@When("^Въведе срок на годност \"([^\"]*)\"$")
	public void addCardExpDate(String expDate) throws Throwable {
		payWithCardScreen.setExpDate(expDate);
	}

	@When("^Въведе име на карта \"([^\"]*)\"$")
	public void addCardHolder(String cardHolder) throws Throwable {
		payWithCardScreen.setCardHolder(cardHolder);
	}

	@When("^Въведе CVV \"([^\"]*)\"$")
	public void addCVV(String CVV) throws Throwable {
		payWithCardScreen.setCardCVV(CVV);
	}


	@When("^Натискане на бутон купи$")
	public void clickBuyBtn() throws Throwable {
		payWithCardScreen.clickBuyBtn();
	}

	@Then("^Въжда съобщение \"([^\"]*)\"$")
	public void checkMessage(String message) throws Throwable {
		assertEquals(message, payWithCardScreen.getRegisterMessage());
	}
}
