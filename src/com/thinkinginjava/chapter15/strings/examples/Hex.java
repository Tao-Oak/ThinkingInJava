//
// Created by Joshua.cao, 2018/09/17
//
package com.thinkinginjava.chapter15.strings.examples;

import net.mindview.util.BinaryFile;

public class Hex {
	public static final String path = "/Users/caotao/Documents/Git/java/ThinkingInJava/bin/com/thinkinginjava/chapter15/strings/examples/";
	public static String format(byte[] data) {
		StringBuilder result = new StringBuilder();
		int n = 0;
		for (byte b: data) {
			if (n % 16 == 0) {
				result.append(String.format("%05x: ", n));
			}
			result.append(String.format("%02x ", b));
			n++;
			if (n % 16 == 0) {
				result.append("\n");
			}
		}
		result.append("\n");
		return result.toString();
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println(format(BinaryFile.read(path + "Hex.class")));
	}
}
