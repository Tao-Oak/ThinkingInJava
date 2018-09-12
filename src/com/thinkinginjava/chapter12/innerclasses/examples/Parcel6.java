//
//Created by CaoTao, 2018/09/09
//
package com.thinkinginjava.chapter12.innerclasses.examples;

public class Parcel6 {

	private void internalTracking(boolean b) {
		if (b) {
			class TrackingSlip {
				private String id;
				public TrackingSlip(String s) {
					id = s;
				}
				String getSlip() {
					return id;
				}
			}
			TrackingSlip tSlip = new TrackingSlip("slip");
			String string = tSlip.getSlip();
			System.out.println(string);
		}
		
		// Cannot use it here! Out of scope!
		// !TrackingSlip ts = new TrackingSlip("slip");
	}
	
	public void track() {
		internalTracking(true);
	}
	
	public static void main(String[] args) {
		Parcel6 p = new Parcel6();
		p.track();
	}
}
