//
// Created by CaoTao, 20180818
//
package com.thinkinginjava.chapter4;

/**
 * Default value for primitive types:
 *
 *	primitiveType			defaultVlaue			size(bits)
 *		boolean					false					--
 *		char					\u0000					16
 *		byte					0						8
 *		short					0						16
 *		int						0						32
 *		long					0L						64
 *		float					0.0f					32
 *		double					0.0						64
 */ 
public class Exercise1_DefaultValue {
	int intValue;
	char charValue;

	
	public static void main (String[] args) {
		Exercise1_DefaultValue obj = new Exercise1_DefaultValue();
		System.out.println("int default value: " + obj.intValue);
		System.out.println("char default value: " + (obj.charValue == '\u0000' ? "space" : "nothing"));
	}
}
