package model;

import java.util.Date;

public class Expense {
	public String name;
	public double value;
	public Date date;
	public Boolean isMensual;

	public Expense() {
		super();
	}
	
	

	public Expense(String name, double value, Date date, Boolean isMensual) {
		super();
		this.name = name;
		this.value = value;
		this.date = date;
		this.isMensual = isMensual;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Expense(String name, double value, Date date) {
		super();
		this.name = name;
		this.value = value;
		this.date = date;
	}

	public Expense(double value) {
		super();
		this.value = value;
	}

	public Expense(String name, double value, Boolean isMensual) {
		super();
		this.name = name;
		this.value = value;
		this.isMensual = isMensual;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double amount) {
		this.value = amount;
	}

	public Boolean getIsMensual() {
		return isMensual;
	}

	public void setIsMensual(Boolean isMensual) {
		this.isMensual = isMensual;

	}

	@Override
	public String toString() {
		return "\nExpense [name=" + name + ", value=" + value + ", date=" + date + ", isMensual=" + isMensual + "]";
	}
}
