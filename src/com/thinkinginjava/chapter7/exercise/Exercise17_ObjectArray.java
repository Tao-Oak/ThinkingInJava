//
// Created by CaoTao, 2018/08/27
//
package com.thinkinginjava.chapter7.exercise;

import java.util.Arrays;

class Bowl {
  Bowl (String type) {
    System.out.println("Bowl(" + type + ")");
  }
}
public class Exercise17_ObjectArray {
  public static void main(String[] args) {
    Bowl[] bowlArray = new Bowl[20];
    System.out.println(Arrays.toString(bowlArray));
    for (int i = 0; i < 20; i++) {
      bowlArray[i] = new Bowl(i + "");
    }
    System.out.println(Arrays.toString(bowlArray));
  }
}