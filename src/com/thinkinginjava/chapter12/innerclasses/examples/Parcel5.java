//
//Created by CaoTao, 2018/09/09
//
package com.thinkinginjava.chapter12.innerclasses.examples;

public class Parcel5 {
	public void f() {}
	public Destination destination(String s) {
		class PDestination implements Destination {
			private String label;
			public PDestination(String s) {
				label = s;
			}
			@Override
			public String readLabel() {
				return label;
			}
			
		}
		return new PDestination(s);
	}
	
	public Contents contents(String s) {
		class PContents implements Contents {
			@Override
			public int value() {
				return 0;
			}
		}
		return new PContents();
	}
	
	public static void main(String[] args) {
		Parcel5 p = new Parcel5();
		@SuppressWarnings("unused")
		Destination destination = p.destination("Tasmania");
	}
}
