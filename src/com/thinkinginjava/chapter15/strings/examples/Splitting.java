//
// Created by Joshua.cao, 2018/09/18
//
package com.thinkinginjava.chapter15.strings.examples;

import java.util.Arrays;

public class Splitting {
	public static String knights = 
			"Then, when you have found the shrubbery, you must " +
			"cut down the mightiest tree in the forest... " +
			"with... a herring!";
	
	public static void split(String regex, int limit) {
		if (limit == -1) {
			System.out.println(Arrays.toString(knights.split(regex)));
		} else {
			System.out.println(Arrays.toString(knights.split(regex, limit)));
		}
		
	}
	
	public static void main(String[] args) {
		split(" ", 5);
		System.out.println();
		split("\\W+", -1);
		System.out.println();
		split("n\\W+", 1);
	}
}
