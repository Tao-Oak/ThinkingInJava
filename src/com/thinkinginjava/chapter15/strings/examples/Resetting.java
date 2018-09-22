//
// Created by Joshua.cao, 2018/09/22
//
package com.thinkinginjava.chapter15.strings.examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Resetting {
	public static void main(String[] args) throws Exception {
		Matcher matcher = Pattern.compile("[frb][aiu][gx]").matcher("fix the rug with bags");
		while(matcher.find()) {
			System.out.print(matcher.group() + "\t");
		}
		System.out.println();
		
		matcher.reset();
		while(matcher.find()) {
			System.out.print(matcher.group() + "\t");
		}
		System.out.println();
		
		
		matcher.reset("fix the rig with rags");
		while(matcher.find()) {
			System.out.print(matcher.group() + "\t");
		}
		System.out.println();
	}
}
