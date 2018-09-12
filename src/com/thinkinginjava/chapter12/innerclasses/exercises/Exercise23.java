//
//Created by CaoTao, 2018/09/10
//
package com.thinkinginjava.chapter12.innerclasses.exercises;

interface U {
	void f();
	void g();
	void h();
}

class A {
	static int counter = 0;
	private int id = counter++;
	
	private U u = new U() {
		@Override
		public void h() {
			System.out.println(id + ": h()");
		}
		@Override
		public void g() {
			System.out.println(id + ": g()");
		}
		@Override
		public void f() {
			System.out.println(id + ": f()");
		}
	};
	
	public U getU() {
		return u;
	}
}

class B {
	private int index = 0;
	private U[] buffer;
	
	public B(int size) {
		buffer = new U[size];
	}
	
	public void add(U item) {
		if (index < buffer.length) {
			buffer[index] = item;
			index++;
		}
	}
	
	public void remove() {
		if (index > 0) {
			buffer[--index] = null;
		}
	}
	
	public void trverseBuffer() {
		for (U u: buffer) {
			if (u != null) {
				u.f();
				u.g();
				u.h();
			}
		}
	}
}

public class Exercise23 {
	public static void main(String[] args) {
		B b = new B(20);
		A[] as = new A[20];
		for (int i = 0; i < 20; i++) {
			as[i] = new A();
		}
		
		for (int i = 0; i < 20; i++) {
			b.add(as[i].getU());
		}
		b.trverseBuffer();
	}
}
