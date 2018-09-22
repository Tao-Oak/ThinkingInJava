//
// Created by Joshua.cao, 2018/09/19
//
package com.thinkinginjava.chapter15.strings.exercises;

import java.util.regex.Pattern;

public class Exercise10 {
	private static String string = "Java now has regular expressions";
	
	public static void main(String[] args) {
		System.out.println("^Java :" + Pattern.matches("^Java", string));
		System.out.println("\\Breg.* :" + Pattern.matches("\\Breg.*", string));
		System.out.println("n.w\\s+h(a|i)s :" + Pattern.matches("n.w\\s+h(a|i)s", string));
		System.out.println("s? :" + Pattern.matches("s?", string));
		System.out.println("s* :" + Pattern.matches("s*", string));
		System.out.println("s+ :" + Pattern.matches("s+", string));
		System.out.println("s{4} :" + Pattern.matches("s{4}", string));
		System.out.println("s{1}. :" + Pattern.matches("s{1}.", string));
		System.out.println("s{0,3} :" + Pattern.matches("s{0,3}", string));
		
		System.out.println(string.matches("^Java"));
		
		Pattern pattern = Pattern.compile("(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b");
		System.out.println(pattern.pattern());
		System.out.println(pattern.toString());
		
		System.out.println(Pattern.quote("a*b"));
	}
}
