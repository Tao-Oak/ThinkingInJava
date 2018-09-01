
//
// Created by CaoTao, 2018/08/22
//
package com.thinkinginjava.chapter5.exercises;

import static net.mindview.util.Print.*;

// page 116
public class Exercise12_LeftRightShift {
  public static String suffixWithWhitespace (int value, int totalLength) {
    int decimalLen = Integer.toString(value).length();

    String resultStr = value + "";
    for (int i = 0; i < totalLength - decimalLen; i++) {
      resultStr += " ";
    }
    return resultStr;
  }

  public static void main(String[] args) {
    int n = 0x7fffffff;
    print("n: " + n + ", binary: " + Integer.toBinaryString(n));
    int decimalLen = Integer.toString(n).length();
    n <<= 5;
    String nStr = suffixWithWhitespace(n, decimalLen);
    print("n: " + nStr + ", binary: " + Integer.toBinaryString(n));
    
    System.out.println();

    int binaryLen = Integer.toBinaryString(n).length();
    for (int i = 0; i < binaryLen; i++) {
      int shiftVal = n >>> i;
      String idxStr = i < 10 ? (i + " ") : (i + "");
      String decimalStr = suffixWithWhitespace(shiftVal, decimalLen);
      String binaryStr = Integer.toBinaryString(shiftVal);
      print("n >>> " + idxStr  + ": " + decimalStr + ", binary: " + binaryStr);
    }
  }
}