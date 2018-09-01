//
// Created by CaoTao, 20180818
//
package com.thinkinginjava.chapter4;

public class Exercise10_CmdLineArgs {
  public static void main (String[] args) {
    for (int i = 0; i < args.length; i++) {
      System.out.println("Command line arg " + i + " is: " + args[i]);
    }
  }
}