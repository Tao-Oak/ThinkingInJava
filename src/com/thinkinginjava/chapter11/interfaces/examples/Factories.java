//
//Created by CaoTao, 2018/09/06
//
package com.thinkinginjava.chapter11.interfaces.examples;

interface Service {
	void method_1();
	void method_2();
}

interface ServiceFactory {
	Service getService();
}

class Implementation1 implements Service {
	public Implementation1() { }

	@Override
	public void method_1() {
		System.out.println("Implementation1 method_1");
	}

	@Override
	public void method_2() {
		System.out.println("Implementation1 method_2");
	}
}

class Implementation1Factory implements ServiceFactory {
	@Override
	public Service getService() {
		return new Implementation1();
	}
}

class Implementation2 implements Service {
	public Implementation2() { }

	@Override
	public void method_1() {
		System.out.println("Implementation2 method_1");
	}

	@Override
	public void method_2() {
		System.out.println("Implementation2 method_2");
	}
}

class Implementation2Factory implements ServiceFactory {
	@Override
	public Service getService() {
		return new Implementation2();
	}
}

public class Factories {
	public static void serviceConsumer(ServiceFactory fact) {
		Service service = fact.getService();
		service.method_1();
		service.method_2();
	}
	
	public static void main(String[] args) {
		serviceConsumer(new Implementation1Factory());
		serviceConsumer(new Implementation2Factory());
	}
}
