//
//Created by CaoTao, 2018/09/10
//
package com.thinkinginjava.chapter12.innerclasses.examples;

public class Parcel11 {
	private static class ParcelContents implements Contents {
		private int i = 11;
		@Override
		public int value() {
			return i;
		}
	}
	
	public class InnerParcel {
		public class P1 {}
		
		// static type can only be declared in static or top level types
		// !static class P2 {}
		// !static void f() {}
		
		// only static constant is allowed
		static final String NAME = "Joshua";
	}
	
	protected static class ParcelDestination implements Destination {
		private String label;
		public ParcelDestination(String whereTo) {
			label = whereTo;
		}
		@Override
		public String readLabel() {
			return label;
		}
		
		public static void f() {}
		static int x = 10;
		static class AnotherLevel {
			public static void f() {}
			static int x = 10;
		}
	}
	
	public static Destination destination(String s) {
		return new ParcelDestination(s);
	}
	
	public static Contents contents() {
		// No enclosing instance of Parcel11 is accessible
		// !new InnerParcel();
		
		return new ParcelContents();
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Contents contents = contents();
		Destination d = destination("Joshua");
		
		Destination d2 = new ParcelDestination("d2");
	}
}
