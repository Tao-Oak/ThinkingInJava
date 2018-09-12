//
//Created by CaoTao, 2018/09/08
//
package com.thinkinginjava.chapter12.innerclasses.exercises;

public class Exercise1_3_Outer {
	private String desc;
	
	public Exercise1_3_Outer(String s) {
		desc = s;
	}
	
	class Inner {
		@Override
		public String toString() {
			return "Inner: " + desc;
		}
	}
	
	public Inner getInner() {
		return new Inner();
	}
	
	public static void main(String[] args) {
		Exercise1_3_Outer obj = new Exercise1_3_Outer("Outer Obj 1");
		Inner inner = obj.getInner();
		System.out.println(inner);
	}
}
