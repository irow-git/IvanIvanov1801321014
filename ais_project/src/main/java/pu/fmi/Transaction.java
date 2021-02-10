package pu.fmi;

import java.sql.Date;

public class Transaction {
	
	public int id;
	public Date date;
	public float cost;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public Transaction(int id, Date date, float cost) {
		super();
		this.id = id;
		this.date = date;
		this.cost = cost;
	}

}
