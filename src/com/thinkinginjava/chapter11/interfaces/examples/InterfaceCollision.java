//
//Created by CaoTao, 2018/09/06
//
package com.thinkinginjava.chapter11.interfaces.examples;

interface I1 { void f(); }

interface I2 { int f(int i); }

interface I3 { int f(); }

/*
interface I4 extends I1, I3 {
	// The return types are incompatible for inherited methods I1.f() and I3.f()
}
*/

class C { public int f() { return 1; } }

class C2 implements I1, I2 {
	@Override
	public int f(int i) { return 0; }
	@Override
	public void f() { }
}

class C3 extends C implements I2 {
	@Override
	public int f(int i) { return 0; }
}

class C4 extends C implements I3 {
	
}

/*
class C5 extends C implements I1 {
	//The return types are incompatible for inherited methods I1.f() and C.f()
}
*/

public class InterfaceCollision {

}
