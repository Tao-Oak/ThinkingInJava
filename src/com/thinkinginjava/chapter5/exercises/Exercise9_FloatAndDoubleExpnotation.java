//
// Created by CaoTao, 2018/08/20
//
package com.thinkinginjava.chapter5.exercises;

public class Exercise9_FloatAndDoubleExpnotation {
  public static void main(String[] args) {
    float maxFloat = 0x8fffffff;
    System.out.println("maxFloat: " + maxFloat + ", Float.MAX_VALUE: " + Float.MAX_VALUE);
    float minFloat = 0x80000000;
    System.out.println("minFloat: " + minFloat + ", Float.MIN_VALUE: " + Float.MIN_VALUE);

    System.out.println("Float.MAX_VALUE: " + Float.toHexString(Float.MAX_VALUE));
    System.out.println("Float.MIN_VALUE: " + Float.toHexString(Float.MIN_VALUE));

    System.out.println("Hex Double.MAX_VALUE: " + Double.toHexString(Double.MAX_VALUE));
    System.out.println("Hex Double.MIN_VALUE: " + Double.toHexString(Double.MIN_VALUE));
    System.out.println("Double.MAX_VALUE: " + Double.MAX_VALUE);
    System.out.println("Double.MIN_VALUE: " + Double.MIN_VALUE);
  }
}