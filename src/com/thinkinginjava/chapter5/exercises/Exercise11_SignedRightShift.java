//
// Created by CaoTao, 2018/08/21
//
package com.thinkinginjava.chapter5.exercises;

import static net.mindview.util.Print.*;

// page 116
public class Exercise11_SignedRightShift {
  public static String suffixWithWhitespace (int value, int totalLength) {
    int decimalLen = Integer.toString(value).length();

    String resultStr = value + "";
    for (int i = 0; i < totalLength - decimalLen; i++) {
      resultStr += " ";
    }
    return resultStr;
  }

  public static void main(String[] args) {
    int n = 0x70101111;
    int decimalLen = Integer.toString(n).length();
    int binaryLen = Integer.toBinaryString(n).length();

    print("n\t: " + n + ", binary: " + Integer.toBinaryString(n));
    for (int i = 1; i <= binaryLen; i++) {
      int shiftValue = n >> i;
      String decimalStr = suffixWithWhitespace(shiftValue, decimalLen);
      String binaryStr = Integer.toBinaryString(shiftValue);
      print("n >> " + i + "\t: " + decimalStr + ", binary: " + binaryStr);
    }
  }
}