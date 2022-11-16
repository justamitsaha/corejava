package com.saha.amit.E_ExceptionHandelling;

public class SupessedException {
	public static void main(String[] args) throws Exception {
		BurbakClass br = null;
		try {
			br = new BurbakClass();
			br.burbakMethod();
		} finally {
			br.close();
		}
	}

}

class BurbakClass implements AutoCloseable {

	public void burbakMethod() {
		throw new NullPointerException("Kuch nahi hone wala");
	}

	@Override
	public void close() throws Exception {
		throw new RuntimeException("Sab Khatam");
	}

}