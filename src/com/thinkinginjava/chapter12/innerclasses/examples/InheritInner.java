//
//Created by CaoTao, 2018/09/10
//
package com.thinkinginjava.chapter12.innerclasses.examples;

class WithInner {
	class Inner{}
}

public class InheritInner extends WithInner.Inner {
	
	public InheritInner(WithInner wi) {
		wi.super();
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		WithInner withInner = new WithInner();
		InheritInner inheritInner = new InheritInner(withInner);
	}
}
