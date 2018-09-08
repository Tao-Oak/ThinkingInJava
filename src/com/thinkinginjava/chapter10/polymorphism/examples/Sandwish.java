//
//Created by CaoTao, 2018/09/05
//
package com.thinkinginjava.chapter10.polymorphism.examples;

class Meal {
	Meal() {
		System.out.println("Meal()");
	}
}

class Bread {
	Bread() {
		System.out.println("Bread()");
	}
}

class Chess {
	Chess() {
		System.out.println("Chess()");
	}
}

class Lettce {
	Lettce() {
		System.out.println("Lettce()");
	}
}

class Lunch extends Meal {
	Lunch() {
		System.out.println("Lunch()");
	}
}

class PortableLunch extends Lunch {
	PortableLunch() {
		System.out.println("PortableLunch()");
	}
}

@SuppressWarnings("unused")
public class Sandwish extends PortableLunch {
	private Bread b = new Bread();
	private Chess c = new Chess();
	private Lettce l = new Lettce();
	Sandwish() {
		System.out.println("Sandwish()");
	}
	
	public static void main(String[] args) {
		new Sandwish();
	}
}
