//
// Created by CaoTao, 20180818
//
package com.thinkinginjava.chapter4;

// Page 65: Special case: primitive types
public class Exercise9_Autoboxing {
  public static void main(String[] args) {
    Boolean b_w = false;
    Character c_w = 'c';
    Byte by_w = 0;
    Short s_w = 1;
    Integer i_w = 2;
    Long l_w = 1000000L;
    Float f_w = 10.0f;
    Double d_w = 100.0;

    boolean b_p = b_w;
    char c_p = c_w;
    byte by_p = by_w;
    short s_p = s_w;
    int i_p = i_w;
    long l_p = l_w;
    float f_p = f_w;
    double d_p = d_w;

    System.out.println(
      "b_p: " + b_p + 
      ", c_p: " + c_p + 
      ", by_p: " + by_p + 
      ", s_p: " + s_p +
      ", i_p: " + i_p +
      ", l_p: " + l_p + 
      ", f_p: " + f_p +
      ", d_p: " + d_p + "");
  }
}