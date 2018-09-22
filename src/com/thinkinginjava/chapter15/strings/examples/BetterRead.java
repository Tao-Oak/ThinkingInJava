//
// Created by Joshua.cao, 2018/09/22
//
package com.thinkinginjava.chapter15.strings.examples;

import java.util.Scanner;

public class BetterRead {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(SimpleReader.input);
		
		System.out.println("What is your name?");
		String name = stdin.nextLine();
		System.out.println(name);
		System.out.println();
			
		System.out.println("How old are you? What is your favorite double?");
		System.out.println("input: <age> <double>");
		int age = stdin.nextInt();
		double favorite = stdin.nextDouble();
		System.out.format("%d %f\n", age, favorite);
		System.out.println();
		
		System.out.format("Hi %s.\n", name);
		System.out.format("In 5 years you will be %d.\n", age + 5);
		System.out.format("My favorite double is %f.", favorite / 2);
	}
}
