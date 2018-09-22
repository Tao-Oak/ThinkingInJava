//
// Created by Joshua.cao, 2018/09/17
//
package com.thinkinginjava.chapter15.strings.examples;

import java.math.BigInteger;
import java.util.Formatter;

public class Convension {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Formatter formatter = new Formatter(System.out);
		
		char u = 'a';
		System.out.println("u = 'a'");
		formatter.format("s: %s\n", u);
		// !formatter.format("d: %d\n", u);
		formatter.format("c: %c\n", u);
		formatter.format("b: %b\n", u);
		// !formatter.format("f: %f\n", u);
		// !formatter.format("e: %e\n", u);
		// !formatter.format("x: %x\n", u);
		formatter.format("h: %h\n", u);
		System.out.println();
		
		int v = 121;
		System.out.println("v = 121");
		formatter.format("s: %s\n", v);
	  formatter.format("d: %d\n", v);
	  formatter.format("c: %c\n", v);
	  formatter.format("b: %b\n", v);
	  // !formatter.format("f: %f\n", v);
	  // !formatter.format("e: %e\n", v);
	  formatter.format("x: %x\n", v);
	  formatter.format("h: %h\n", v);
	  System.out.println();
	  
	  BigInteger w = new BigInteger("50000000000000");
	  System.out.println("w = new BigInteger(\"50000000000000\")");
	  formatter.format("s: %s\n", w);
	  formatter.format("d: %d\n", w);
	  // !formatter.format("c: %c\n", w);
	  formatter.format("b: %b\n", w);
	  // !formatter.format("f: %f\n", w);
		// !formatter.format("e: %e\n", w);
		formatter.format("x: %x\n", w);
		formatter.format("h: %h\n", w);
		System.out.println();
		
		double x = 179.543;
		System.out.println("x = 179.543");
	  // !formatter.format("d: %d\n", x);
	  // !formatter.format("c: %c\n", x);
	  formatter.format("b: %b\n", x);
	  formatter.format("s: %s\n", x);
	  formatter.format("f: %f\n", x);
		formatter.format("e: %e\n", x);
		// !formatter.format("x: %x\n", x);
		formatter.format("h: %h\n", x);
		System.out.println();
		
		Concatenation y = new Concatenation();
		System.out.println("y = new Concatenation()");
	  // !formatter.format("d: %d\n", y);
	  // !formatter.format("c: %c\n", y);
	  formatter.format("b: %b\n", y);
	  formatter.format("s: %s\n", y);
	  // !formatter.format("f: %f\n", y);
		// !formatter.format("e: %e\n", y);
		// !formatter.format("x: %x\n", y);
		formatter.format("h: %h\n", y);
		System.out.println();
		
		boolean z = false;
		System.out.println("z = false");
	  // !formatter.format("d: %d\n", z);
	  // !formatter.format("c: %c\n", z);
	  formatter.format("b: %b\n", z);
	  formatter.format("s: %s\n", z);
	  // !formatter.format("f: %f\n", z);
		// !formatter.format("e: %e\n", z);
		// !formatter.format("x: %x\n", z);
		formatter.format("h: %h\n", z);
		System.out.println();
	}
}
