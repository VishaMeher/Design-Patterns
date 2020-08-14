package com.creational.singleton;

public class LazySingleton {

	private static LazySingleton INSTANCE;

	// sometimes thread do caching for class variable so in multi threaded
	// environment use Volatile keyword
	// private static volatile LazySingleton INSTANCE;

	private LazySingleton() {

	}

	// double check locking

	public static LazySingleton getInstance() {
		if (INSTANCE == null) {
			synchronized (LazySingleton.class) {
				if (INSTANCE == null) {
					INSTANCE = new LazySingleton();
				}
			}

		}
		return INSTANCE;
	}
}
