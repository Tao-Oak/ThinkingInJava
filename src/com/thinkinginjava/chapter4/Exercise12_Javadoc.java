//
// Created by CaoTao, 20180818
//
package com.thinkinginjava.chapter4;


public class Exercise12_Javadoc {
  /**
   * The first documentation example.
   */
  public class Documentation1 {
    /**
     * This is a field comment
     */
    public int i;
    /**
     * This is a method comment
     */
    public void f() {}
  }

  /**
   * The second documentation example with &lt;pre&gt; html tag.
   */
  public class Documentation2 {
    /**
     * This is a field comment
     * <pre>
     *  System.out.println(new Date())
     * </pre>
     */
    public int i;
    /** A method comment */
    public void f() {}
  }

  /**
   * The third documentation example with a html list.
   */
  public class Documentation3 {
    /**
     * You can <em>even</em> insert a list:
     * <ul>
     * <li> Item one
     * <li> Item two
     * <li> Item three
     * </ul>
     */
    public int i;
    /** A method comment */
    public void f() {}
  }
}