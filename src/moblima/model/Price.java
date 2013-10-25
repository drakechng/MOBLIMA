package moblima.model;

import java.io.Serializable;

public class Price implements Serializable {

	private String priceTitle;
	private String priceDescription;
	private String startTime;
	private String endTime;
	private int startDay;
	private int endDay;
	private boolean allowPH;
	private String cinemaType;

	public String getPriceTitle() {
		return this.priceTitle;
	}

	public void setPriceTitle(String priceTitle) {
		this.priceTitle = priceTitle;
	}

	public String getPriceDescription() {
		return this.priceDescription;
	}

	public void setPriceDescription(String priceDescription) {
		this.priceDescription = priceDescription;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public int getStartDay() {
		return this.startDay;
	}

	public void setStartDay(int startDay) {
		this.startDay = startDay;
	}

	public int getEndDay() {
		return this.endDay;
	}

	public void setEndDay(int endDay) {
		this.endDay = endDay;
	}

	public boolean isAllowPH() {
		return this.allowPH;
	}

	public void setAllowPH(boolean allowPH) {
		this.allowPH = allowPH;
	}

	public String getCinemaType() {
		return this.cinemaType;
	}

	public void setCinemaType(String cinemaType) {
		this.cinemaType = cinemaType;
	}

}