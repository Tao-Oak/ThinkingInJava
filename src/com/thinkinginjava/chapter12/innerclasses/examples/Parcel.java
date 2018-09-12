//
//Created by CaoTao, 2018/09/08
//
package com.thinkinginjava.chapter12.innerclasses.examples;

// Normal(non-inner) class cannot be made private or protected;
// they may only be given public or package access.
// !protected class A{}

public class Parcel {
	private class PContents implements Contents {
		private int i = 11;
		
		@Override
		public int value() {
			return i;
		}
	}
	
	protected class PDestination implements Destination {
		private String label;
		
		public PDestination(String whereTo) {
			label = whereTo;
		}
		
		public String readLabel() {
			return label;
		}
	}
	
	public Destination to(String s) {
		return new PDestination(s);
	}
	
	public Contents contents() {
		return new PContents();
	}
	
	public void ship(String dest) {
		@SuppressWarnings("unused")
		Contents contents = new PContents();
		Destination destination = new PDestination(dest);
		System.out.println(destination.readLabel());
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Parcel parcel = new Parcel();
		parcel.ship("Tasmania");
		
		Parcel qParcel = new Parcel();
		Contents contents = qParcel.contents();
		Destination destination = qParcel.to("Borneo");
		
		Parcel p3 = new Parcel();
		Contents c = p3.new PContents();
		Destination d = p3.new PDestination("No Where");
	}
}
