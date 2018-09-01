//
// Created by CaoTao, 2018/08/25
//
package com.thinkinginjava.chapter7.exercise;

public class Exercise3_DefaultConstructor {
  Exercise3_DefaultConstructor() {
    System.out.println("This is a default constructor");
  }

  Exercise3_DefaultConstructor(String input) {
    System.out.println("This is a overloaded constructor with input: " + input);
  }

  public static void main(String[] args) {
    new Exercise3_DefaultConstructor();
    new Exercise3_DefaultConstructor("Little baby!");
  }
}