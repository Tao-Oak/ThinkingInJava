//
// Created by Joshua.Cao, 2018/09/15
//
package com.thinkinginjava.chapter13.holding.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

class ReversibleArrayList<T> extends ArrayList<T> {
	private static final long serialVersionUID = 1L;

	public ReversibleArrayList(Collection<T> c) {
		super(c);
	}
	
	public Iterable<T> reversed() {
		return new Iterable<T>() {
			int current = size() - 1;
			@Override
			public Iterator<T> iterator() {
				
				return new Iterator<T>() {

					@Override
					public boolean hasNext() {
						return current > -1;
					}

					@Override
					public T next() {
						return get(current--);
					}
					
					@Override
					public void remove() {
						throw new UnsupportedOperationException();
					}
				};
			}
		};
	}
}

public class AdapterMethodIdiom {
	public static void main(String[] args) {
		ReversibleArrayList<String> reversibleArrayList = new ReversibleArrayList<>(
				Arrays.asList("To be or not to be".split(" ")));
		for (String string: reversibleArrayList) {
			System.out.print(string + " ");
		}
		System.out.println();
		for (String string: reversibleArrayList.reversed()) {
			System.out.print(string + " ");
		}
		System.out.println();
	}
}
