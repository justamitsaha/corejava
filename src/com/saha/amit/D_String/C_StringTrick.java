package com.saha.amit.D_String;

public class C_StringTrick {
	public static void main(String[] args) {
		String a = "abc";
		String b = a.toUpperCase();
		b = b.replace("B", "2").replace('C', '3');
		System.out.println("a=" + a);
		System.out.println("b=" + b);

		StringBuilder ab = new StringBuilder("abc");
		StringBuilder bb = ab.append("de");
		bb = bb.append("f").append("g");
		System.out.println("a=" + ab);
		System.out.println("b=" + bb);
	}
}