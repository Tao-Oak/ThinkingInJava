//
// Created by Joshua.cao, 2018/09/16
//
package com.thinkinginjava.chapter15.strings.examples;

public class WhitherStringBuilder {
	public String implicit(String[] fields) {
		String result = "";
		for (int i = 0; i < fields.length; i++) {
			result += fields[i];
		}
		return result;
	}
	
	public String explicit(String[] fields) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < fields.length; i++) {
			result.append(fields[i]);
		}
		return result.toString();
	}
}
