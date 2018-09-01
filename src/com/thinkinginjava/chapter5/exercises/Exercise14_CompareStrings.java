//
// Created by CaoTao, 2018/08/22
//
package com.thinkinginjava.chapter5.exercises;

public class Exercise14_CompareStrings {
  private void compareString (String x, String y) {
    System.out.println("x == y: " + (x == y));
    System.out.println("x != y: " + (x != y));
    System.out.println("x.equals(y): " + x.equals(y));
    System.out.println();
  }

  public static void main(String[] args) {
    Exercise14_CompareStrings obj = new Exercise14_CompareStrings();
    obj.compareString("12345678", "12345678");
    obj.compareString("12", "123");

    String str1 = "123" + "456";
    String str2 = "123456";
    obj.compareString(str1, str2);

    String str3 = new String("1234567");
    String str4 = new String("1234567");
    obj.compareString(str3, str4);
  }
}