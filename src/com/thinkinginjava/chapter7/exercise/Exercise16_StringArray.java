//
// Created by CaoTao, 2018/08/27
//
package com.thinkinginjava.chapter7.exercise;

import java.util.Random;

public class Exercise16_StringArray {
  public static void main(String[] args) {
    String[] strArray = new String[20];
    Random rand = new Random();
    for (int i = 0; i < 20; i++) {
      strArray[i] = rand.nextGaussian() + "";
    }

    for (int i = 0; i < 20; i++) {
      System.out.println("strArray[" + i + "] = " + strArray[i]);
    }
  }
}