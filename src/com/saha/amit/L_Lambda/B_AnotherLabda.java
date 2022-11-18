package com.saha.amit.L_Lambda;

public class B_AnotherLabda {

	public static void main(String[] args) {
		StringLengthInterface myLambda = stringvar -> stringvar.length();
		System.out.println(myLambda.getLength("Hello"));

		StringConcatLengthInterface myLambda2 = (s1, s2) -> (s1 + s2).length();
		print(myLambda2, "hello", "world");
	}

	public static void print(StringConcatLengthInterface lamda, String s1, String s2) {
		System.out.println(lamda.getLength(s1, s2));
	}
}

//@FunctionalInterface
interface StringLengthInterface {
	int getLength(String stringvar);

	// Below is not abstract so thisn interface is still Functional
	static void someNonAbstractMethod() {
		System.out.println("hi");
	}

}

@FunctionalInterface
interface StringConcatLengthInterface {
	int getLength(String stringvar1, String stringvar2);
}

@FunctionalInterface
interface StringConcatLengthInterface2 extends StringConcatLengthInterface{
	//int getLength2(String stringvar1, String stringvar2);  //If we add this it will no longer be functional interface
}

//Lambdas can be called only for interface with single abstract method called Functional Interface
