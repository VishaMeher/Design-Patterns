package com.creational.singleton;

public class RuntimeSingletonDemo {

	public static void main(String[] args) {

		Runtime ref1 = Runtime.getRuntime();
		Runtime ref2 = Runtime.getRuntime();

		if (ref1 == ref2) {
			System.out.println("same object");
		}

	}

}
