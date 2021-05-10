package users;

public class Expense {
	public String title;
	public double value;
	public MyDate date;
	public Boolean isMensual;

	public Expense() {
		super();
	}
	
	

	public Expense(String title, double value, MyDate date, Boolean isMensual) {
		super();
		this.title = title;
		this.value = value;
		this.date = date;
		this.isMensual = isMensual;
	}
	



	public MyDate getDate() {
		return date;
	}



	public void setDate(MyDate date) {
		this.date = date;
	}



	public Expense(String title, double value, MyDate date) {
		super();
		this.title = title;
		this.value = value;
		this.date = date;
	}



	public Expense(double value) {
		super();
		this.value = value;
	}

	public Expense(String title, double value, Boolean isMensual) {
		super();
		this.title = title;
		this.value = value;
		this.isMensual = isMensual;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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
//		String s1 ="\n" + title + " - ";
//		double double1 = amount;
//		String s2 =(isMensual ? " euro/month" : " one-time") + " payment";	
//		System.out.format("%32s%8f%16s", s1, double1, s2);
//		System.out.println();
		return "\n" + title + " - " + value + (isMensual ? " euro/month" : " one-time") + " payment";
	}

}
