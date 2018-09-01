//
// Created by CaoTao, 2018/08/22
//
package com.thinkinginjava.chapter5.exercises;

import static net.mindview.util.Print.*;

// page 116
public class Exercise13_DisplayCharBinaryForm {
  public static void main(String[] args) {
    String s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      print(c + ", int: " + (int)c + ", binary: " + Integer.toBinaryString(c));
    }
  }
}