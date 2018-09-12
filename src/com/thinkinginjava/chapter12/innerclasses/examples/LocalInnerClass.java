//
//Created by CaoTao, 2018/09/12
//
package com.thinkinginjava.chapter12.innerclasses.examples;

interface Counter {
	int next();
}

public class LocalInnerClass {
	private int count = 0;
	
	Counter getCounter(final String name) {
		class LocalCounter implements Counter {
			public LocalCounter() {
				System.out.println("LocalCounter()");
			}
			@Override
			public int next() {
				System.out.println(name);
				return count++;
			}
		}
		return new LocalCounter();
	}
	
	Counter getCounter2(final String name) {
		return new Counter() {
			{
				System.out.println("Counter()");
			}
			@Override
			public int next() {
				System.out.println(name);
				return count++;
			}
		};
	}
	
	public static void main(String[] args) {
		LocalInnerClass obj = new LocalInnerClass();
		Counter c1 = obj.getCounter("Local inner ");
		Counter c2 = obj.getCounter2("Anonymous inner ");
		for (int i = 0; i < 5; i++) {
			System.out.println(c1.next());
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(c2.next());
		}
	}
}
