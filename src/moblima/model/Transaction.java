package moblima.model;

import java.io.Serializable;

public class Transaction implements Serializable {

	private String TID;
	private double amount;
	private String bankCard;

	public String getTID() {
		return this.TID;
	}

	public void setTID(String TID) {
		this.TID = TID;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getBankCard() {
		return this.bankCard;
	}

	public void setBankCard(String bankCard) {
		this.bankCard = bankCard;
	}

}