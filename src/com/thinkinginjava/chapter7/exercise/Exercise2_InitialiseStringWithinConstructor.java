//
// Created by CaoTao, 2018/08/23
//
package com.thinkinginjava.chapter7.exercise;

/*
 * 1. Don't initialize with the default values in declaration
 * (null, false, 0, 0.0…).
 * 
 * 2. Prefer initialization in declaration if you don't have a constructor
 * parameter that changes the value of the field.
 * 
 * 3. If the value of the field changes because of a constructor parameter 
 * put the initialization in the constructors.
 */
public class Exercise2_InitialiseStringWithinConstructor {
  private String str1;
  private String str2 = "Initialized at the point of creation";

  public Exercise2_InitialiseStringWithinConstructor(String str) {
    str1 = str;
  }

  public static void main(String[] args) {
    Exercise2_InitialiseStringWithinConstructor obj;
    obj = new Exercise2_InitialiseStringWithinConstructor("Hello World!");

    System.out.println("str1: " + obj.str1);
    System.out.println("str2: " + obj.str2);
  }
}