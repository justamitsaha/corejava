package com.saha.amit.F_InbuildFunctionalInterface;

import java.util.function.Predicate;

//Predicate to test a condition.
public class D_PredicateFunctioanlInterface {
	public static void main(String[] args) {
		
		Predicate<Integer> isEven = i -> i%2 ==0;
		Predicate<Integer> isGreaterThan50 = i -> i>50;
		System.out.println(isEven.test(22));
		System.out.println(isGreaterThan50.test(51));
		
		System.out.println(isGreaterThan50.and(isEven).test(71));
		System.out.println(isGreaterThan50.or(isEven).test(40));
		System.out.println(isGreaterThan50.negate().test(22));
		System.out.println(isGreaterThan50.negate().and(isEven).test(22));
		System.out.println(isGreaterThan50.and(isEven.negate()).test(53));
		
	}
}
