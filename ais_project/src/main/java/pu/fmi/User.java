package pu.fmi;

import java.util.HashSet;
import java.util.Set;

public class User {
	
	private String username;
	private String password;
	private String email;
	private float walletFunds;
	private Set<CardInformation> cardInformations = new HashSet<CardInformation>();
	private Set<Transaction> transaction = new HashSet<Transaction>();
 	
	public User(String username, String password, String email, float walletFunds) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.walletFunds = walletFunds;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getWalletFunds() {
		return walletFunds;
	}
	public void setWalletFunds(float walletFunds) {
		this.walletFunds = walletFunds;
	}
	public Set<CardInformation> getCardInformation() {
		return cardInformations;
	}
	public void setCardInformation(Set<CardInformation> cardInformation) {
		cardInformations = cardInformation;
	}
	public void addCardInformation(CardInformation cardInformation) {
		cardInformations.add(cardInformation);
	}
	public Set<Transaction> getTransaction() {
		return transaction;
	}
	public void setTransaction(Set<Transaction> transaction) {
		this.transaction = transaction;
	}
	public void addTransaction(Transaction transactions) {
		transaction.add(transactions);
	}

}
