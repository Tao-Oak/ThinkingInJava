//
// Created by Joshua.cao, 2018/09/16
//
package com.thinkinginjava.chapter15.strings.examples;

public class Immutable {
	public static String upperCase(String s) {
		return s.toUpperCase();
	}
	
	public static void main(String[] args) {
		String q = "HOWDY";
		System.out.println(q);
		String qq = upperCase(q);
		System.out.println(qq);
		System.out.println(q);
		
		System.out.println(q == qq);
		
		String str1 = new String("str");
		String str2 = new String("str");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
	}
}
