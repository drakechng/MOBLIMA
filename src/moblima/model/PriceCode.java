package moblima.model;

import java.io.Serializable;

public class PriceCode implements Serializable {

	private int priceCodeID;
	private double priceCodeAmount;

	public int getPriceCodeID() {
		return this.priceCodeID;
	}

	public void setPriceCodeID(int priceCodeID) {
		this.priceCodeID = priceCodeID;
	}

	public double getPriceCodeAmount() {
		return this.priceCodeAmount;
	}

	public void setPriceCodeAmount(double priceCodeAmount) {
		this.priceCodeAmount = priceCodeAmount;
	}

}