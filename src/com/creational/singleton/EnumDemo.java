package com.creational.singleton;

public class EnumDemo {

	public static void main(String[] args) {
		EnumSingleton singleton = EnumSingleton.INSTANCE;
		EnumSingleton singleton2 = EnumSingleton.INSTANCE;

		singleton.setValue(1);
		singleton2.setValue(2);
		System.out.println(singleton.getValue());
		System.out.println(singleton2.getValue());

		if (singleton == singleton2) {
			System.out.println("Two objects are same");
		} else {
			System.out.println("Two objects are not same");
		}
	}
}