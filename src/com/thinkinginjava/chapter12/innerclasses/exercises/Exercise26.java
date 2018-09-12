//
//Created by CaoTao, 2018/09/12
//
package com.thinkinginjava.chapter12.innerclasses.exercises;

class Joshua {
	public class Oak {
		@SuppressWarnings("unused")
		private int height = 0;
		public Oak(int height) {
			this.height = height;
			System.out.println("Oak want Joshua keep her accompany.");
		}
	}
}

public class Exercise26 {
	private class Inner extends Joshua.Oak {
		public Inner(Joshua josh) {
			josh.super(12);
		}
	}
	
	public Inner getInner(Joshua josh) {
		return new Inner(josh);
	}
	
	public static void main(String[] args) {
		Joshua joshua = new Joshua();
		Exercise26 obj = new Exercise26();
		obj.getInner(joshua);
	}
}
