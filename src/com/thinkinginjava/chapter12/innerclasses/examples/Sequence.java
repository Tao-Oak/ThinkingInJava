//
//Created by CaoTao, 2018/09/08
//
package com.thinkinginjava.chapter12.innerclasses.examples;

public class Sequence {
	private Object[] items;
	private int next = 0;
	
	public Sequence(int size) {
		items = new Object[size];
	}
	
	public void add(Object x) {
		if (next < items.length) {
			items[next++] = x;
		}
	}
	
	private class SequenceSelector implements Selector {
		private int i = 0;
		@Override
		public boolean end() {
			return i == items.length;
		}

		@Override
		public Object current() {
			return items[i];
		}

		@Override
		public void next() {
			if (i < items.length) i++;
		}
		
		@SuppressWarnings("unused")
		public Sequence outer() {
			return Sequence.this;
		}
	}
	
	public Selector selector() {
		return new SequenceSelector();
	}
	
	public Selector reverseSelector() {
		return new Selector() {
			private int i = items.length - 1;
			
			@Override
			public void next() {
				i--;
			}
			
			@Override
			public boolean end() {
				return i < 0;
			}
			
			@Override
			public Object current() {
				return items[i];
			}
		};
	}
	
	public static void main(String[] args) {
		Sequence s = new Sequence(10);
		for(int i = 0; i < 10; i++) {
			s.add(Integer.toString(i));
		}
		Selector selector = s.selector();
		while(!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
		System.out.println();
	}
}
