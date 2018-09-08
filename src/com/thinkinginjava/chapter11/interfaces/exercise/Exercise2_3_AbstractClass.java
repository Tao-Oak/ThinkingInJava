//
//Created by CaoTao, 2018/09/06
//
package com.thinkinginjava.chapter11.interfaces.exercise;

abstract class WithoutAbstractMethod {}

abstract class Base extends WithoutAbstractMethod {
	Base() {
		print();
	}
	abstract void print();
}

public class Exercise2_3_AbstractClass extends Base {
	private int i = 10;
	
	@Override
	void print() {
		System.out.println("i = " + i);
	}
	
	public static void main(String[] args) {
		Exercise2_3_AbstractClass obj = new Exercise2_3_AbstractClass();
		obj.print();
	}
}
