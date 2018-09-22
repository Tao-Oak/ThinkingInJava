//
// Created by Joshua.cao, 2018/09/18
//
package com.thinkinginjava.chapter15.strings.exercises;

import java.util.regex.Pattern;

import com.thinkinginjava.chapter15.strings.examples.Splitting;

public class Exercise9 {
	private static String string = Splitting.knights;
	
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("[aeiou]");
		System.out.println(string.replaceAll(pattern.pattern(), "_"));
	}
}
