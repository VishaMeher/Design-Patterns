package com.creational.singleton;

import java.io.Serializable;

public class Serialization implements Serializable {

	private static Serialization INSTANCE;
	private int i;

	private Serialization() {

	}

	// double check locking

	public static Serialization getInstance() {
		if (INSTANCE == null) {
			synchronized (Serialization.class) {
				if (INSTANCE == null) {
					INSTANCE = new Serialization();
				}
			}

		}
		return INSTANCE;
	}

	public void setValue(int i) {
		this.i = i;

	}

	public int getValue() {
		return i;
	}

	
	// to avoid deserializtion problems
	/*
	  protected Object readResolve() { return INSTANCE; }
	 */

}
