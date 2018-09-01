//
// Created by CaoTao, 20180818
//
package com.thinkinginjava.chapter4;

public class Exercise8_StaticField {
  public static String CLAZZ_NAME = "Exercise8_StaticField";

  @SuppressWarnings("all")
  public static void main (String[] args) {
    Exercise8_StaticField[] objBuffer = new Exercise8_StaticField[10];
    for (int i = 0; i < 10; i++) {
      objBuffer[i] = new Exercise8_StaticField();
    }

    boolean hasSameClazzName = true;
    for (int i = 1; i < 10; i++) {
    	
      if (objBuffer[i - 1].CLAZZ_NAME != objBuffer[i].CLAZZ_NAME) {
        hasSameClazzName = false;
        break;
      }
    }

    System.out.println(hasSameClazzName
      ? "There is only one CLAZZ_NAME"
      : "There are many CLAZZ_NAME");
  }
}