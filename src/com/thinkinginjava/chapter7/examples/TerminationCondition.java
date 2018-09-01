//
// Created by CaoTao, 2018/08/26
//
package com.thinkinginjava.chapter7.examples;

class Book {
  boolean checkedOut = false;

  Book (boolean checkout) {
    checkedOut = checkout;
  }

  void checkIn () {
    checkedOut = false;
  }

  @Override
  protected void finalize() throws Throwable {
    if (checkedOut) {
      System.out.println("Error: checked out");
    }
    super.finalize();
  }
}

public class TerminationCondition {
  public static void main(String[] args) {
    Book novel = new Book(true);
    novel.checkIn();

    new Book(true);
    System.gc();
  }
}