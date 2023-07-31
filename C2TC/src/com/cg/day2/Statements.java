package com.cg.day2;

public class Statements {

	public static void main(String[] args) {
		System.out.println("IF");
		int b=3,c=7;
		if(b<c) {
			System.out.println("b is less than c");
		}
		System.out.println("ELSE");
		if(b>c) {
			System.out.println("t");
		}else {
			System.out.println("f");
		}
		System.out.println("IF ELSE LADDER");
		if(b<3) {
			System.out.println("hi");
		}else if(b<2) {
			System.out.println("hello");
		}else {
			System.out.println("heyyyyy");
		}
		System.out.println("SWITCH");
		switch(b) {
		case 1:
			System.out.println("m");
			break;
		case 2:
			System.out.println("t");
			break;
		case 3:
			System.out.println("w");
			break;
		case 4:
			System.out.println("thu");
			break;
		case 5:
			System.out.println("f");
			break;
		}
		System.out.println("BREAK");
		for(int i=0;i<=5;i++) {
			if(i==2)
				break;
			System.out.println(i+" ");
		}
		System.out.println("CONTINUE");
		for(int i=0;i<5;i++) {
			if(i==2)
				continue;
			System.out.println(i+" ");
		}
	}

}
