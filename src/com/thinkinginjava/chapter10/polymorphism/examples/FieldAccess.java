//
//Created by CaoTao, 2018/09/05
//
package com.thinkinginjava.chapter10.polymorphism.examples;

class Super {
	public int field = 0;
	
	public int getField() {
		return field;
	}
}

class Sub extends Super {
	public int field = 1;
	
	@Override
	public int getField() {
		return field;
	}
	
	public int getSuperField() {
		return super.field;
	}
}

public class FieldAccess {
	public static void main(String[] args) {
		Super sup = new Sub();
		System.out.println("sup.field = " + 
				sup.field + ", sup.getField() = " + 
				sup.getField());
		
		System.out.println();
		
		Sub sub = new Sub();
		System.out.println("sub.field = " +
				sub.field + ", sub.getField() = " + 
				sub.getField() +
				", sub.getSuperField() = " +
				sub.getSuperField());
	}

}
