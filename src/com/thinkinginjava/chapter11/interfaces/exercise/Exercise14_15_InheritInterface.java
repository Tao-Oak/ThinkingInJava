//
//Created by CaoTao, 2018/09/08
//
package com.thinkinginjava.chapter11.interfaces.exercise;

interface First {
	void method_1();
	void method_2();
}

interface Second {
	void method_3();
	void method_4();
}

interface Third {
	void method_5();
	void method_6();
}

interface Inherit extends First, Second, Third {
	void method_7();
}

abstract class Concrete {
	abstract void method_8();
}


public class Exercise14_15_InheritInterface extends Concrete implements Inherit {

	@Override
	public void method_1() {
	}

	@Override
	public void method_2() {
	}

	@Override
	public void method_3() {
	}

	@Override
	public void method_4() {
	}

	@Override
	public void method_5() {
	}

	@Override
	public void method_6() {
	}

	@Override
	public void method_7() {
	}
	
	@Override
	void method_8() {
	}
	
	static void u(First x) {
		x.method_1();
		x.method_2();
	}
	
	static void v(Second x) {
		x.method_3();
		x.method_4();
	}
	
	static void w(Third x) {
		x.method_5();
		x.method_6();
	}
	
	static void y(Inherit x) {
		x.method_1();
		x.method_2();
		x.method_3();
		x.method_4();
		x.method_5();
		x.method_6();
		x.method_7();
	}

	public static void main(String[] args) {
		Exercise14_15_InheritInterface obj = new Exercise14_15_InheritInterface();
		u(obj);
		v(obj);
		w(obj);
		y(obj);
	}
}
