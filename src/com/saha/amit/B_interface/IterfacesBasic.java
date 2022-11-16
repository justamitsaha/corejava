package com.saha.amit.B_interface;

interface TestInterface{
	
	public static final String test = "";
	
	String test2 = "";
	
	public String run();
	
	public static String run2() {return "Bhus";}	//Interface can have implementation if they are marked static
	
	public default String run3() {return "Bhus";}	//Interface can have implementation if they are marked default	
}

class TestClass implements TestInterface{
	@Override
	public String run() {return "Lu la lo";}
}

class TestClass2 implements TestInterface{
	@Override
	public String run() {return "Lu la clo";}
	
	public String run2() {return "Lu la lo";}
}





public class IterfacesBasic  {

	
	public static void main(String[] args) {
		TestInterface ti = new TestClass();
		System.out.println(ti.run());
		
		TestClass tc = new TestClass();
		System.out.println(tc.run());
		System.out.println(tc.run3());
		
		TestClass2 tc2 = new TestClass2();
		System.out.println(tc2.run2());
	}

}

/*
 *  Since Java 8 we can have method implementation in Interface but it has to be marked as default
 *  Static methods are also available but these are for Interface only as a utility method and are not available to other classes implementing it
 */
