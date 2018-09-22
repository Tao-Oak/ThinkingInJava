//
// Created by Joshua.cao, 2018/09/18
//
package com.thinkinginjava.chapter15.strings.examples;

public class Replacing {
	static String string = Splitting.knights;
	
	public static void main(String[] args) {
		System.out.println(string.replaceFirst("f\\w+", "located"));
		System.out.println();
		System.out.println(string.replaceAll("shrubbery|tree|herring", "banana"));
	}
}
