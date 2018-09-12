//
//Created by CaoTao, 2018/09/08
//
package com.thinkinginjava.chapter12.innerclasses.examples;

public class DotThis {
	void f() {
		System.out.println("DotThis.f()");
	}
	
	public class Inner {
		public DotThis outer() {
			return DotThis.this;
		}
	}
	
	public Inner inner() {
		return new Inner();
	}
	
	public static void main(String[] args) {
		DotThis dot = new DotThis();
		Inner inner = dot.inner();
		inner.outer().f();
	}
}
