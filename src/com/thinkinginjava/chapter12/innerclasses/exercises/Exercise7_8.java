//
//Created by CaoTao, 2018/09/09
//
package com.thinkinginjava.chapter12.innerclasses.exercises;

public class Exercise7_8 {
	private String name;
	
	public Exercise7_8(String name) {
		this.name = name;
	}
	
	private void printName(String prefix) {
		System.out.println(prefix + " " + name);
	}
	
	class Inner {
		private String name = "Inner";
		private void modifyOuterName(String name) {
			Exercise7_8.this.name = name;
			printName("");
		}
	}
	
	public void createInner() {
		printName("Before");
		Inner inner = new Inner();
		inner.name = "Modify by outer";
		System.out.println(inner.name);
		inner.modifyOuterName("Joshua");
		printName("After");
	}
	
	public static void main(String[] args) {
		Exercise7_8 obj = new Exercise7_8("Appreciation");
		obj.createInner();
	}
}
