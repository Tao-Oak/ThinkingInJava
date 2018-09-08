//
//Created by CaoTao, 2018/09/08
//
package com.thinkinginjava.chapter11.interfaces.exercise;

interface A {
	void a();
}

interface B extends A {
	void b();
}
interface C extends A {
	void c();
}

interface D extends B, C {
	void d();
}

public class Exercise13_DiamondProblem implements D {

	@Override
	public void b() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void a() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void d() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void c() {
		// TODO Auto-generated method stub
		
	}

}
