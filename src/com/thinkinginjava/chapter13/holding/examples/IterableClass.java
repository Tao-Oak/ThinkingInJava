//
// Created by Joshua.Cao, 2018/09/15
//
package com.thinkinginjava.chapter13.holding.examples;

import java.util.Iterator;
import java.util.Map;

public class IterableClass implements Iterable<String>{
	protected String[] words = ("And that is how " +
			"we know the Earth to be banana-shaped.").split(" ");

	@Override
	public Iterator<String> iterator() {
		return new Iterator<String>() {
			private int index = 0;
			@Override
			public boolean hasNext() {
				return index < words.length;
			}

			@Override
			public String next() {
				return words[index++];
			}
			
			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}
	
	public static void main(String[] args) {
		for (String s: new IterableClass()) {
			System.out.print(s + " ");
		}
		System.out.println();
		for(Map.Entry<String, String> entry: System.getenv().entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
