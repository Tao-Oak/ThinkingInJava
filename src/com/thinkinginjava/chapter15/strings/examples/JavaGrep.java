//
// Created by Joshua.cao, 2018/09/22
//
package com.thinkinginjava.chapter15.strings.examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.mindview.util.TextFile;

public class JavaGrep {
	private static final String fileName = "src/com/thinkinginjava/chapter15/strings/examples/JavaGrep.java";
	
	public static void main(String[] args) {
		String regexp = "\\b[Ssct]\\w+";
		
		Pattern pattern = Pattern.compile(regexp);
		int index = 0, lineNum = 0;
		Matcher matcher = pattern.matcher("");
		for (String line: new TextFile(fileName)) {
			System.out.println("line: " + lineNum++);
			matcher.reset(line);
			while (matcher.find()) {
				System.out.println(index++ + ": " + matcher.group() + ": " + matcher.start());
			}
		}
	}
}
