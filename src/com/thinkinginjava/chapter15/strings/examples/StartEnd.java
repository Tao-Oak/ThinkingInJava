//
// Created by Joshua.cao, 2018/09/21
//
package com.thinkinginjava.chapter15.strings.examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartEnd {
	public static String input =
			"As long as there is injustice, whenever a\n" +
			"Targathian baby cries out, wherever a distress\n" +
			"signal sounds among the stars ... We'll be there.\n" +
			"This fine ship, and this fine crew ...\n" +
			"Never give up! Never surrender!";
	public static String anotherInput = Groups.POEM;
	
	private static class Display {
		private boolean regexPrinted = false;
		private String regex;
		
		public Display(String regex) {
			this.regex = regex;
		}
		
		void display(String message) {
			if (!regexPrinted) {
				System.out.println(regex);
				regexPrinted = true;
			}
			System.out.println(message);
		}
	}
	
	static void examine(String s, String regex) {
		Display display = new Display(regex);
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);
		while(matcher.find()) {
			display.display("find() '" + matcher.group() + "' start = " + matcher.start() + " end = " + matcher.end());
		}
		if (matcher.lookingAt()) {
			display.display("lookingAt() start = " + matcher.start() + " end = " + matcher.end());
		}
		if (matcher.matches()) {
			display.display("matches() start = " + matcher.start() + " end = " + matcher.end());
		}
	}
	
	public static void main(String[] args) {
		for (String string: input.split("\n")) {
			System.out.println("input: " + string);
			for(String regex: new String[]{"\\w*ere\\w*", "\\w*ever", "T\\w+", "Never.*?!"}) {
				examine(string, regex);
			}
		}
	}
}
