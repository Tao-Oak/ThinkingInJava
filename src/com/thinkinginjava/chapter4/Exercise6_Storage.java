//
// Created by CaoTao, 20180818
//
package com.thinkinginjava.chapter4;

// Page 73: The argument list

public class Exercise6_Storage {
  private int storage (String s) {
    return s.length() * 2;
  }

  public static void main(String[] args) {
    Exercise6_Storage obj = new Exercise6_Storage();
    String longStr = "Exercise6_Storage obj = new Exercise6_Storage();";
    int memSize = obj.storage(longStr);
    System.out.println("The memSize of long string is " + memSize + " bytes");
  }
}