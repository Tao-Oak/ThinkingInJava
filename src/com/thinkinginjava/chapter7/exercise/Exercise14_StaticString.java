//
// Created by CaoTao, 2018/08/27
//
package com.thinkinginjava.chapter7.exercise;

class Cup {
  static String str1 = "str1";
  static String str2;
  static {
    str2 = "str2";
  }

  static void print () {
    System.out.println(str1 + ", " + str2);
  }
}

public class Exercise14_StaticString {
  public static void main(String[] args) {
    Cup.print();
  }
}