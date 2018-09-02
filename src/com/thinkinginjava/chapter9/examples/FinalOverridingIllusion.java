//
// Created by CaoTao, 2018/09/02
//
package com.thinkinginjava.chapter9.examples;

import static net.mindview.util.Print.*;

class WithFinals {
	@SuppressWarnings("unused")
	private final void f() {
		print("WithFinals.f()");
	}
	
	@SuppressWarnings("unused")
	private void f(int marker) {
		print("WithFinals.f(int marker)");
	}
	
	void f(String marker) {
		print("WithFinals.f(int marker)");
	}
	
	@SuppressWarnings("unused")
	private void g() {
		print("WithFinals.g()");
	}
}

class OverridingPrivate extends WithFinals {
	@SuppressWarnings("unused")
	private final void f() {
		print("OverridingPrivate.f()");
	}
	
	@Override
	void f(String marker) {
		print("OverridingPrivate.f(int marker)");
	}
	
	@SuppressWarnings("unused")
	private void g() {
		print("OverridingPrivate.g()");
	}
	
	public final void h() {
		print("OverridingPrivate.h()");
	}
	
	public final void h(int marker) {
		print("OverridingPrivate.h(int marker)");
	}
	
	public void h(String marker) {
		print("OverridingPrivate.h(String marker)");
	}
}

class OverridingPrivate2 extends OverridingPrivate {
	public final void f() {
		print("OverridingPrivate2.f()");
	}
	
	public void g() {
		print("OverridingPrivate2.g()");
	}
	
	// Cannot override the final method from OverridingPrivate
	/*
	public void h() {
		print("OverridingPrivate2.h()");
	}
	*/
}

public class FinalOverridingIllusion {
	public static void main(String[] args) {
		OverridingPrivate2 op2 = new OverridingPrivate2();
		op2.f();
		op2.g();
		
		@SuppressWarnings("unused")
		OverridingPrivate op = op2;
		// op.f();
		// op.g();
		
		@SuppressWarnings("unused")
		WithFinals wf = op2;
		// wf.f();
		// wf.g();
	}
}
