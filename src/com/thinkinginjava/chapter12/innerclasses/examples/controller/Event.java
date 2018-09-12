//
//Created by CaoTao, 2018/09/10
//
package com.thinkinginjava.chapter12.innerclasses.examples.controller;

public abstract class Event {
	private long eventTime;
	protected final long delayTime;
	
	public Event(long delayTime) {
		this.delayTime = delayTime;
		start();
	}
	
	public void start() {
		eventTime = System.nanoTime() + delayTime;
	}
	
	public boolean ready() {
		return System.nanoTime() >= eventTime;
	}
	
	public abstract void action();
}
