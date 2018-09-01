//
// Created by CaoTao, 2018/08/20
//
package com.thinkinginjava.chapter5.examples;

public class Exponential {
  public static void main(String[] args) {
    float expFloat = 1.39e-43f;
    System.out.println("expFloat: " + expFloat);
    float expFloat2 = 1.39E-43f;
    System.out.println("expFloat2: " + expFloat2);

    double expDouble = 47e47d;
    System.out.println("expDouble: " + expDouble);
    double expDoubl2 = 47e47;
    System.out.println("expDoubl2: " + expDoubl2);
  }
}