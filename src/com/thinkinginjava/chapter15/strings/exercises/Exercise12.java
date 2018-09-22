//
// Created by Joshua.cao, 2018/09/21
//
package com.thinkinginjava.chapter15.strings.exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise12 {
	static public final String POEM = "Twas brillig, and the slithy toves\n" +
	    "Did gyre and gimble in the wabe.\n" +
	    "All mimsy were the borogoves,\n" +
	    "And the mome raths outgrabe.\n\n" +
	    "Beware the Jabberwock, my son,\n" +
	    "The jaws that bite, the claws that catch.\n" +
	    "Beware the Jubjub bird, and shun\n" +
	    "The frumious Bandersnatch.";
	
	public static void main(String[] args) {
		Matcher matcher = Pattern.compile("\\b([a-z]\\w+)\\S?\\b").matcher(POEM);
		while(matcher.find()) {
			System.out.println(matcher.group(1));
		}
	}
}
