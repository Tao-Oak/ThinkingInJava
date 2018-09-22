//
// Created by Joshua.cao, 2018/09/16
//
package com.thinkinginjava.chapter15.strings.examples;

public class SimpleFormat {
	public static void main(String[] args) {
		int x = 5;
		double y = 5.332542;
		
		System.out.println("Row 1: [" + x + " " + y + "]");
		System.out.format("Row 1: [%d %f]\n", x, y);
		System.out.printf("Row 1: [%d %f]\n", x, y);
	}
}
