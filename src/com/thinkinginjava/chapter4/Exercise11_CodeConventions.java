//
// Created by CaoTao, 20180818
//
package com.thinkinginjava.chapter4;

public class Exercise11_CodeConventions {
  public static void main (String[] args) {
    System.getProperties().list(System.out);
    System.out.println("--- --- ---");
    System.out.println(System.getProperty("user.name"));
    System.out.println("--- --- ---");
    System.out.println(System.getProperty("java.library.path"));
  }
}