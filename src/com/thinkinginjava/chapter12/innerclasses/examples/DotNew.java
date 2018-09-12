//
//Created by CaoTao, 2018/09/08
//
package com.thinkinginjava.chapter12.innerclasses.examples;

public class DotNew {
	public class Inner {}
	
	public static void main(String[] args) {
		DotNew dot = new DotNew();
		@SuppressWarnings("unused")
		DotNew.Inner inner = dot.new Inner();
	}
}
