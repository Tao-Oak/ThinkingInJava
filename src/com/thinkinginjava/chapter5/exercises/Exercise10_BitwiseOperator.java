//
// Created by CaoTao, 2018/08/20
//
package com.thinkinginjava.chapter5.exercises;

public class Exercise10_BitwiseOperator {
  public static void main(String[] args) {
    int v1 = 0xaa, v2 = 0x55;
    System.out.println("v1: " + Integer.toBinaryString(v1));
    System.out.println("v2: " + Integer.toBinaryString(v2));
    System.out.println("v1 & v2: " + Integer.toBinaryString(v1 & v2));
    System.out.println("v1 | v2: " + Integer.toBinaryString(v1 | v2));
    System.out.println("v1 ^ v2: " + Integer.toBinaryString(v1 ^ v2));
    System.out.println("~v1: " + Integer.toBinaryString(~v1));
    System.out.println("~v2: " + Integer.toBinaryString(~v2));
  }
}