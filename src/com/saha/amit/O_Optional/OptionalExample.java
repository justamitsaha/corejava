package com.saha.amit.O_Optional;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		var x = optionalOfMethod("Hello boy");
		var y = optionalOfMethod("Hello0");
		System.out.println(x);
		System.out.println(y);
		System.out.println(x.get());
		// System.out.println(y.get()); Will give no such element exception
		optionalNullCheck();
		mapFlatMap();
		filter();
	}

	public static Optional<Character> optionalOfMethod(String str) {
		if (str.length() > 6) {
			return Optional.of(str.charAt(6));
		} else {
			return Optional.empty();
		}
	}

	public static void optionalNullCheck() {
		String[] str = new String[10];
		str[4] = "Laura";
		Optional<String> opt = Optional.ofNullable(str[5]);  // When not sure if the value is null or not
		opt.ifPresent(System.out::println);
		System.out.println(opt.orElse("Land chus"));
	}
	
	public static void mapFlatMap() {
		Optional<String> opt1 = Optional.of("hello!");
		Optional<String> opt2 = Optional.empty();
		
		System.out.println(opt1.map(String::toUpperCase));
		System.out.println(opt2.map(String::toUpperCase));   // map has the check to prevent null pointer
		
		Optional<Optional<String>> opt3 = Optional.of(opt1);
		System.out.println(opt3.map(s->s.map(String::toUpperCase)));
		System.out.println(opt3.flatMap(s->s.map(String::toUpperCase)));
	}
	
	public static void filter() {
		Optional<String> opt = Optional.of("India");
		System.out.println(opt.filter(s ->s.equalsIgnoreCase("india")));
	}
	
	public static void optionalNullCheck2() {
		Optional<String> opt = Optional.empty();
		System.out.println(opt.isEmpty());
		opt.ifPresent(c -> System.out.println("Its not empty" +c));
		System.out.println(opt.isPresent());
	}
}
