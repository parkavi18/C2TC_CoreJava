package com.cg.day5;

public class Child2 extends Child1 {
	void sub(int a,int b) {
		int c=a-b;
		System.out.println("sub:"+c);		
	}
	public static void main(String[] args) {
		Child2 ch=new Child2();
		ch.add(1, 3);
		ch.mul(3, 5);
		ch.sub(3, 3);
		}
}