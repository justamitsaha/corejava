package com.saha.amit.B_interface;

interface A {
	default String run () {
		return "I am stupid";
	}
}

interface B {
	default String run () {
		return "I am sexy";
	}
}

public class MultipleInterface implements A,B {
	@Override
	public String run() {
		return A.super.run();
	}
}
