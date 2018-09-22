//
// Created by Joshua.cao, 2018/09/22
//
package com.thinkinginjava.chapter15.strings.examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.mindview.util.TextFile;

public class TheReplacement {
	public static String string = 
			"Here's a block of text to use as input to\n" + 
			"the regular expression matcher. Note that we'll\n" + 
			"first extract the block of text by looking for\n" + 
			"the special delimiters, then process the\n" + 
			"extracted block.";
	
	public static void main(String[] args) {
		String s = TextFile.read("TheReplacement.java");
		System.out.println(s);
		Matcher mInput = Pattern.compile("/\\*!(.*)!\\*", Pattern.DOTALL).matcher(s);
	}
}
