//
//Created by CaoTao, 2018/09/09
//

package com.thinkinginjava.chapter12.innerclasses.examples;

public class Parcel10 {
	public Destination destination(String dest, float price) {
		return new Destination() {
			private int cost;
			
			{
				cost = Math.round(price);
				if (cost > 100) {
					System.out.println("Over budget!");
				}
			}
			private String label = dest;
			
			@Override
			public String readLabel() {
				return label;
			}
		};
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Parcel10 parcel10 = new Parcel10();
		Destination destination = parcel10.destination("Tasmania", 101.395F);
	}
}
