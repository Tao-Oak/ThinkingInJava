//
//Created by CaoTao, 2018/09/09
//
package com.thinkinginjava.chapter12.innerclasses.examples;

public class Parcel8 {
	public class Wrapping {
		private int i;
		public Wrapping(int x) {
			i = x;
		}
		public int value() {
			return i;
		}
	}
	
	public Wrapping wrapping(int x) {
		return new Wrapping(x) {
			@Override
			public int value() {
				return super.value() * 47;
			}
		};
	}
	
	public Destination destination(String str) {
		return new Destination() {
			private String label = str;
			@Override
			public String readLabel() {
				return label;
			}
		};
	}
	
	public static void main(String[] args) {
		Parcel8 parcel8 = new Parcel8();
		Wrapping wrapping = parcel8.wrapping(10);
		System.out.println(wrapping.value());
		
		Destination destination = parcel8.destination("BEIJING");
		System.out.println(destination.readLabel());
	}
}
