package com.saha.amit.A_abstract;

abstract class AbstractClasses2 {
	
	public abstract String run();
		
	String hello;
	
	public String run2() {
		return "Hello";
	}
	
	{
		System.out.println("This is a block");
	}

	public AbstractClasses2() {
	}
	
}


public class AbstractClasses extends AbstractClasses2{

	@Override
	public String run() {
		// TODO Auto-generated method stub
		return null;
	}
}

/*
 * Difference between interfaces and Abstract classes
 * 1> Instance variables not allowed in Interface, variables are marked as final and static by default in interface but Abstract classes can have instance variables
 * 2> Instance blocks can be created in Abstract classes not in Interfaces
 * 3> Abstract classes can't be used as functional interface in Lambdas
 * 4> Abstract classes can have constructors
 */
