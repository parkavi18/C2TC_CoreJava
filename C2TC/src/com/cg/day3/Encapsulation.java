package com.cg.day3;

public class Encapsulation {
	private String name;
	private int ID;
	private int acccount_num;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getAcccount_num() {
		return acccount_num;
	}
	public void setAcccount_num(int acccount_num) {
		this.acccount_num = acccount_num;
	}
	@Override
	public String toString() {
		return "Encapsulation [name=" + name + ", ID=" + ID + ", acccount_num=" + acccount_num + "]";
	}
}
