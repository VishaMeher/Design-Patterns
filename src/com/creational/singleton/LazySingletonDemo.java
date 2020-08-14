package com.creational.singleton;

public class LazySingletonDemo {

	public static void main(String[] args) {
		LazySingleton ref1 = LazySingleton.getInstance();
		LazySingleton ref2 = LazySingleton.getInstance();

		System.out.println(ref1 == ref2);

	}

}
