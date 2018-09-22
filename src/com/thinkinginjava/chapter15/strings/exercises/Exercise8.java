//
// Created by Joshua.cao, 2018/09/18
//
package com.thinkinginjava.chapter15.strings.exercises;

import java.util.Arrays;

import com.thinkinginjava.chapter15.strings.examples.Splitting;

public class Exercise8 {
	private static String string = Splitting.knights;
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(string.split("the")));
		System.out.println(Arrays.toString(string.split("you")));
	}
}
