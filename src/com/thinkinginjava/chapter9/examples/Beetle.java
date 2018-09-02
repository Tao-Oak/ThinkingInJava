//
// Created by CaoTao, 2018/09/02
//
package com.thinkinginjava.chapter9.examples;

import static net.mindview.util.Print.*;

class Insect {
	private int i = 9;
	protected int j;
	Insect() {
		print("i = " + i + ", j = " + j);
		j = 39;
	}
	
	@SuppressWarnings("unused")
	private static int x1 = printInit("static Insect.x1 initialized");
	
	static int printInit(String s) {
		print(s);
		return 47;
	}
}

public class Beetle extends Insect {
	private int k = printInit("Beetle.k initialized");
	
	public Beetle() {
		print("k = " + k);
		print("j = " + j);
	}
	@SuppressWarnings("unused")
	private static int x2 = printInit("static Beetle.x2 initialized");
	
	public static void main(String[] args) {
		print("Beetle constructor");
		@SuppressWarnings("unused")
		Beetle b = new Beetle();
	}
}
