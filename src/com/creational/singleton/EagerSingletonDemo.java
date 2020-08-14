package com.creational.singleton;

public class EagerSingletonDemo {

	public static void main(String[] args) {
		EagerSingleton ref1 = EagerSingleton.getInstance();
		EagerSingleton ref2 = EagerSingleton.getInstance();

		System.out.println(ref1 == ref2);
	}

}
