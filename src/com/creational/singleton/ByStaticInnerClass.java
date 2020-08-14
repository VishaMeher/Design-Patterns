package com.creational.singleton;

public class ByStaticInnerClass {

	private ByStaticInnerClass() {

	}

	private static class InnerClass {
		static ByStaticInnerClass INSTANCE = new ByStaticInnerClass();
	}

	public static ByStaticInnerClass getInstance() {
		return InnerClass.INSTANCE;
	}

}
