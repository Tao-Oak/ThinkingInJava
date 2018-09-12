//
//Created by CaoTao, 2018/09/12
//
package com.thinkinginjava.chapter12.innerclasses.examples;

class Egg2 {
	protected class Yolk {
		public Yolk() {
			System.out.println("Egg.Yolk()");
		}
		public void f() {
			System.out.println("Egg.Yolk.f()");
		}
	}
	private Yolk yolk = new Yolk();
	public Egg2() {
		System.out.println("new Egg()");
	}
	
	public void insertYolk(Yolk yy) {
		yolk = yy;
	}
	
	public void g() {
		yolk.f();
	}
}

public class BigEgg2 extends Egg2 {
	public class Yolk extends Egg2.Yolk {
		public Yolk() {
			System.out.println("BigEgg2.Yolk()");
		}
		public void f() {
			System.out.println("BigEgg2.Yolk.f()");
		}
	}
	public BigEgg2() {
		insertYolk(new Yolk());
	}

	public static void main(String[] args) {
		BigEgg2 egg2 = new BigEgg2();
		egg2.g();
	}
}
