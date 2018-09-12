//
//Created by CaoTao, 2018/09/09
//
package com.thinkinginjava.chapter12.innerclasses.examples;

public class Parcel7 {
	public Contents contents() {
		return new Contents() {
			private int i = 11;
			@Override
			public int value() {
				return i;
			}
		};
	}
	
	@SuppressWarnings("unused")
	private Destination destination = new Destination() {
		@Override
		public String readLabel() {
			return "Anonymous destination";
		}
	};

	public static void main(String[] args) {
		Parcel7 parcel7 = new Parcel7();
		System.out.println(parcel7.contents().value());
	}
}
