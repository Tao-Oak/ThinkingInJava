//
//Created by CaoTao, 2018/09/12
//
package com.thinkinginjava.chapter12.innerclasses.examples;

class Egg {
	@SuppressWarnings("unused")
	private Yolk yolk;
	protected class Yolk {
		public Yolk() {
			System.out.println("Egg.Yolk()");
		}
	}
	
	public Egg() {
		System.out.println("new Egg()");
		yolk = new Yolk();
	}
}

public class BigEgg extends Egg {
	public class Yolk {
		public Yolk() {
			System.out.println("BigEgg.Yolk()");
		}
	}
	
	public static void main(String[] args) {
		new BigEgg();
	}
}
