//
// Created by Joshua.Cao, 2018/09/15
//
package com.thinkinginjava.chapter13.holding.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class MultiIterableClass extends IterableClass {
	public Iterable<String> reversed() {
		return new Iterable<String>() {
			@Override
			public Iterator<String> iterator() {
				return new Iterator<String>() {
					int current = words.length  - 1;
					@Override
					public boolean hasNext() {
						return current > -1;
					}
					@Override
					public String next() {
						return words[current--];
					}
					@Override
					public void remove() {
						throw new UnsupportedOperationException();
					}
				};
			}
		};
	}
	
	public Iterable<String> randomized() {
		return new Iterable<String>() {
			@Override
			public Iterator<String> iterator() {
				List<String> shuffled = new ArrayList<>(Arrays.asList(words));
				Collections.shuffle(shuffled, new Random(47));
				return shuffled.iterator();
			}
		};
	}
	
	public static void main(String[] args) {
		MultiIterableClass multiIterableClass  = new MultiIterableClass();
		for (String s: multiIterableClass.reversed()) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		for (String s: multiIterableClass.randomized()) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		for (String s: multiIterableClass) {
			System.out.print(s + " ");
		}
		System.out.println();
	}
}
