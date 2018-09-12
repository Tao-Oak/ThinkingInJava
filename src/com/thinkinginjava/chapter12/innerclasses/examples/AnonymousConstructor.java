//
//Created by CaoTao, 2018/09/09
//
package com.thinkinginjava.chapter12.innerclasses.examples;

abstract class Base {
	public Base(int i) {
		System.out.println("Base constructor, i = " + i);
	}
	public abstract void f();
}

public class AnonymousConstructor {
	public static Base getBase(int i) {
		return new Base(i) {
			{
				System.out.println("Inside instance initializer");
			}

			@Override
			public void f() {
				System.out.println("In anonumous, f()");
			}
		};
	}

	public static void main(String[] args) {
		Base base = getBase(47);
		base.f();
	}
}
