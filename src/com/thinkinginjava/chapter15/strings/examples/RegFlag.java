//
// Created by Joshua.cao, 2018/09/22
//
package com.thinkinginjava.chapter15.strings.examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegFlag {
	public static String string = "java has regex\nJava has regex\n" + 
			"JAVA has pretty good regular expressions\n" + 
			"Regular expressions are in \rJAva";
	
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("^java", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.UNIX_LINES);
		Matcher matcher = pattern.matcher(string);
		
		while(matcher.find())
			System.out.println(matcher.group());
	}
}
