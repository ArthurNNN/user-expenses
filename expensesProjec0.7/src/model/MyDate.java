package model;

public class MyDate {
	
	int day;
	int month;
	int year;
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int mouth) {
		this.month = mouth;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public MyDate(int day, int mouth, int year) {
		super();
		this.day = day;
		this.month = mouth;
		this.year = year;
	}
	public MyDate() {
		super();
	}
	
	

}
