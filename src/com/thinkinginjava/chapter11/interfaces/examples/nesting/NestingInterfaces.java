//
//Created by CaoTao, 2018/09/06
//
package com.thinkinginjava.chapter11.interfaces.examples.nesting;

public class NestingInterfaces {
	public class BImp implements A.B {
		@Override
		public void f() { }
	}
	
	class CImp implements A.C {
		@Override
		public void f() { }
	}
	
//	// Cannot implement a private interface except 
//	// within that interface's defining class
//	class DImp implements A.D {
//		@Override
//		public void f() { }
//	}
	
	class EImp implements E {
		@Override
		public void g() { }
	}
	
	class EGImp implements E.G {
		@Override
		public void f() { }
	}
	
	class EImp2 implements E {
		@Override
		public void g() { }
		
		class EG implements E.G {
			@Override
			public void f() { }
		}
	}
	
	public static void main(String[] args) {
		A a = new A();
		
		// Cannot access A.D
		// !A.D ad = a.getD();
		
		// Doesn't return anything by A.D
		// !A.DImp2 dImp2 = a.getD();
		
		// Cannot access a member of the interface
		// !a.getD().f();
		
		// Only another A can do anything with getD()
		A a2 = new A();
		a2.receiveD(a.getD());
	}
}
