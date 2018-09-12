//
//Created by CaoTao, 2018/09/10
//
package com.thinkinginjava.chapter12.innerclasses.examples;

interface Incrementable {
	void increment();
}

class Callee_1 implements Incrementable {
	private int i = 0;

	@Override
	public void increment() {
		i++;
		System.out.println(i);
	}
}

class MyIncrement {
	public void increment() {
		System.out.println("Other operation");
	}
	
	static void f(MyIncrement mi) {
		mi.increment();
	}
}

class Callee_2 extends MyIncrement {
	private int i = 0;

	@Override
	public void increment() {
		super.increment();
		i++;
		System.out.println(i);
	}
	
	private class Closure implements Incrementable {
		@Override
		public void increment() {
			Callee_2.this.increment();
		}
	}
	
	Incrementable getCallbackReference() {
		return new Closure();
	}
}

class Caller {
	private Incrementable callbackReference;
	
	public Caller(Incrementable cbh) {
		callbackReference = cbh;
	}
	
	void go() {
		callbackReference.increment();
	}
}

public class Callbacks {
	public static void main(String[] args) {
		Callee_1 callee_1 = new Callee_1();
		Callee_2 callee_2 = new Callee_2();
		MyIncrement.f(callee_2);
		Caller caller_1 = new Caller(callee_1);
		Caller caller_2 = new Caller(callee_2.getCallbackReference());
		System.out.println();
		caller_1.go();
		caller_1.go();
		caller_2.go();
		caller_2.go();
	}
}
