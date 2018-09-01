//
// Created by CaoTao, 2018/08/26
//
package com.thinkinginjava.chapter7.exercise;

class FinalizeExample {
  private int mId;
  FinalizeExample (int id) {
    mId = id;
  }

  @Override
  protected void finalize() throws Throwable {
    System.out.println("finalize " + mId + " was called!");
    super.finalize();
  }
}

public class Exercise10_11_Finalize {
  public static void main(String[] args) {
    FinalizeExample[] buffer = new FinalizeExample[100];
    for (int i = 0; i < 100; i++) {
      buffer[i] = new FinalizeExample(i);
    }
    buffer = null;
    new FinalizeExample(101);
    System.gc();

    int i = 0;
    while (i < 100) {
      i++;
      System.gc();
    }
  }
}