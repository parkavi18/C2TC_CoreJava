package com.cg.day3;

public class Constructor {
	int num1;
	int num2;
	int result;
	Constructor(){
		num1=20;
		num2=21;
	}
	void display() {
		result=num1+num2;
		System.out.println("result:"+result);
}
}
