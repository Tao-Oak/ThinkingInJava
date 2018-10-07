//
// Created by Joshua.cao, 2018/09/25
//
package com.thinkinginjava.chapter16.rtti.examples;

class Candy {
	static {
		System.out.println("Loading Candy");
	}
}

class Gum {
	static {
		System.out.println("...Loading Gum");
	}
}

class Cookie {
	static {
		System.out.println("Loading Cookie");
	}
}

public class SweetShop {
	public static void main(String[] args) {
		System.out.println("inside main");
		new Candy();
		System.out.println("Ater creating Candy");
		try {
			Class.forName("com.thinkinginjava.chapter16.rtti.examples.Gum", true, SweetShop.class.getClassLoader());
		} catch (ClassNotFoundException e) {
			System.out.println("Couldn't find Gum");
		}
		System.out.println("Ater Class.forName(\"Gum\")");
		new Cookie();
		System.out.println("Ater creating Cookie");
	}
}
