//
//Created by CaoTao, 2018/09/05
//
package com.thinkinginjava.chapter10.polymorphism.examples;

class StaticSuper {
	public static String staticGet() {
		return "Base staticGet()";
	}
	
	public String dynamicGet() {
		return "Base dynamicGet()";
	}
}

class StaticSub extends StaticSuper {
	public static String staticGet() {
		return "Derived staticGet()";
	}
	
	@Override
	public String dynamicGet() {
		return "Derived dynamicGet()";
	}
}

public class StaticPolymorphic {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		StaticSuper sup = new StaticSub();
		System.out.println(sup.staticGet());
		System.out.println(sup.dynamicGet());
	}
}
