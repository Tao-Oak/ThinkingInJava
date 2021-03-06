//
// Created by Joshua.cao, 2018/09/21
//
package com.thinkinginjava.chapter15.strings.examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Groups {
	static public final String POEM = "Twas brillig, and the slithy toves\n" +
	    "Did gyre and gimble in the wabe.\n" +
	    "All mimsy were the borogoves,\n" +
	    "And the mome raths outgrabe.\n\n" +
	    "Beware the Jabberwock, my son,\n" +
	    "The jaws that bite, the claws that catch.\n" +
	    "Beware the Jubjub bird, and shun\n" +
	    "The frumious Bandersnatch.";
	
	public static void main(String[] args) {
		Matcher matcher = Pattern.compile("(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$").matcher(POEM);
		
		while (matcher.find()) {
			for (int i = 0; i <= matcher.groupCount(); i++) {
				System.out.print("[" + matcher.group(i) + "] ");
			}
			System.out.println();
		}
	}
}
