//
// Created by CaoTao, 20180818
//
package com.thinkinginjava.chapter4;

// Page 70: Fields and methods
class DataOnly {
  int i;
  double d;
  boolean b;
}

public class Exercise4_5_DataOnly {
  public static void main (String[] args) {
    DataOnly data = new DataOnly();
    data.i = 47;
    data.d = 1.1;
    data.b = false;
    System.out.println("data.i = " + data.i
          + ", data.d = "+ data.d + ", data.b = " + data.b);
  }
} 