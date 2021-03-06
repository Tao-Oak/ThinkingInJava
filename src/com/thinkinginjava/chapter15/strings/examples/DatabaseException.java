//
// Created by Joshua.cao, 2018/09/17
//
package com.thinkinginjava.chapter15.strings.examples;

public class DatabaseException extends Exception {
	private static final long serialVersionUID = 1L;

	public DatabaseException(int transactionID, int queryID, String message) {
		super(String.format("(t%d, q%d) %s", transactionID, queryID, message));
	}
	
	public static void main(String[] args) {
		try {
			throw new DatabaseException(3, 7, "Write failed");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
