//
// Created by Joshua.cao, 2018/09/22
//
package com.thinkinginjava.chapter15.strings.examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.mindview.util.TextFile;

/*! Here's a block of text to use as input to
    the regular expression matcher. Note that we'll
    first extract the block of text by looking for
    the special delimiters, then process the
    extracted block. !*/

public class TheReplacement {
	public static void main(String[] args) {
		String s = TextFile.read("src/com/thinkinginjava/chapter15/strings/examples/TheReplacement.java");
		
		Matcher mInput = Pattern.compile("/\\*!(.*)!\\*", Pattern.DOTALL).matcher(s);
		if (mInput.find()) {
			s = mInput.group(1);
		}
		s = s.replaceAll(" {2,}", " ");
		s = s.replaceAll("(?m)^ +", "");
		// s = s.replaceAll("(?m)^ {1,}", "");
		System.out.println(s);
		
		s = s.replaceFirst("[aeiou]", "(VOWEL1)");
		System.out.println(s);
		
		System.out.println();
		
		StringBuffer sBuffer = new StringBuffer();
		Pattern pattern = Pattern.compile("[aeiou]");
		Matcher matcher = pattern.matcher(s);
		int counter = 1;
		while(matcher.find()) {
			String str = (counter++) + "_" + matcher.group().toUpperCase();
			matcher.appendReplacement(sBuffer, str);
		}
		matcher.appendTail(sBuffer);
		System.out.println(sBuffer);
		
	}
}
