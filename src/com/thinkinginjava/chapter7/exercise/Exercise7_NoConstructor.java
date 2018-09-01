//
// Created by CaoTao, 2018/08/26
//
package com.thinkinginjava.chapter7.exercise;

public class Exercise7_NoConstructor {
  public static void main(String[] args) {
    Exercise7_NoConstructor obj = new Exercise7_NoConstructor();
    if (obj != null) {
      System.out.println("Constructor is automatically synthesized");
    }
  }
}