//
// Created by CaoTao, 2018/08/27
//
package com.thinkinginjava.chapter7.exercise;

class Tank {
  private boolean mIsEmpty = true;

  Tank (boolean isEmpty) {
    mIsEmpty = isEmpty;
  }

  void fill () {
    mIsEmpty = false;
  }

  void empty () {
    mIsEmpty = true;
  }

  @Override
  protected void finalize() throws Throwable {
    if (!mIsEmpty) {
      System.out.println("Tank cannot be destroyed when it is full!");
    }
    super.finalize();
  }
}

public class Exercise12_Tank {
  public static void main(String[] args) {
    Tank tank = new Tank(false);
    tank.empty();
    new Tank(false);
    System.gc();
  }
}