package com.creational.singleton;

public class ByStaticInnerClassDemo {

	public static void main(String[] args) {
		ByStaticInnerClass ref1 = ByStaticInnerClass.getInstance();
		ByStaticInnerClass ref2 = ByStaticInnerClass.getInstance();

		System.out.println(ref1 == ref2);
	}

}
