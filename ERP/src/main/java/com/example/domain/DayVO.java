package com.example.domain;

import java.util.Date;

public class DayVO {
	private String day;
	private int wom;

	public int getDow() {
		return wom;
	}

	public void setDow(int dow) {
		this.wom = dow;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}
}
