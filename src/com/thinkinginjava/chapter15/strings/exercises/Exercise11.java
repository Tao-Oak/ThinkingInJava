//
// Created by Joshua.cao, 2018/09/20
//
package com.thinkinginjava.chapter15.strings.exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise11 {
	private static String string = "Arline ate eight apples and one orange while Anita hadn't any";
	
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("(?i)((^(?<start>[aeiou]))|(\\s+([aeiou])))\\w+?[aeiou]\\b");
		Matcher matcher = pattern.matcher(string);
		System.out.println("capturing group count: " + matcher.groupCount());
		System.out.println("lookingAt: " + matcher.lookingAt());
		System.out.println("matches: " + matcher.matches());
		System.out.println("regionStart: " + matcher.regionStart()
				+ ", regionEnd: " + matcher.regionEnd()
				+ ", string length: " + string.length());
		System.out.println();
		
		int counter = 0;
		while ((counter == 5 && matcher.find(6)) || matcher.find()) {
			System.out.println(matcher.group()
					+ "\t'" + matcher.group(1) + "'"
					+ "\t'" + matcher.group(2) + "'"
					+ "\t'" + matcher.group(3) + "'"
					+ "\t'" + matcher.group(4) + "'"
					+ "\t'" + matcher.group(5) + "'");
			System.out.println("Range: [" + matcher.start() + ", " + (matcher.end() - 1) + "]");
			System.out.println("Capture 1 range: [" + matcher.start(1) + ", " + (matcher.end(1) - 1) + "]");
			System.out.println("Capture 'start':" + matcher.group("start"));
			System.out.println("hitEnd: " + matcher.hitEnd());
			System.out.println();
			
			if (counter == 4) {
				System.out.println("--- --- ---");
			}
			counter++;
		}
		System.out.println();
		
		Pattern pattern2 = Pattern.compile("(a(b)?)+?");
		Matcher matcher2 = pattern2.matcher("aba");
		while (matcher2.find()) {
			System.out.println(matcher2.group() + ", " + matcher2.group(1) + ", " + matcher2.group(2));
		}
	}
}
