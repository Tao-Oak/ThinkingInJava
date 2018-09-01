//
// Created by CaoTao, 2018/08/26
//
package com.thinkinginjava.chapter7.exercise;

public class Exercise6_ReversedParamsOrder {
  void bark (int times, String content) {
    for (int i = 0; i < times; i++) {
      System.out.print(content + "\t");
    }
    System.out.println();
  }

  void bark (String content, int times) {
    for (int i = 0; i < times; i++) {
      System.out.print(content + "\t");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Exercise6_ReversedParamsOrder obj = new Exercise6_ReversedParamsOrder();
    obj.bark(10, "INC");
    obj.bark(2, "DESC");
  }
}