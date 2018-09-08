//
//Created by CaoTao, 2018/09/06
//
package com.thinkinginjava.chapter11.interfaces.examples.nesting;

public interface E {
	interface G { void f(); }
	
	// Redundant "public"
	public interface H { void f(); }
	
	void g();
	
	// Cannot be private within an interface
	// private interface I {}
}
