package com.saha.amit.L_Lambda;

public class B_Lambda {
	
	static String st2 = "Wow";

	public static void main(String[] args) {
		String st = "Hello ";
		TestInterface tst = s -> {
			//st = "Hello !!";
			return st + s;
		};
		System.out.println(tst.test("World"));
	}
}

interface TestInterface {
	String test(String st);
}