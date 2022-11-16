package com.saha.amit.E_ExceptionHandelling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {

	static String fileName = "C:\\AMIT\\workspace\\corejava\\src\\com\\saha\\amit\\L_ExceptionHandelling\\amit.txt";

	public static void main(String[] args) throws IOException {
		readFileBeforeJava7();
		readFIleWithJava7();
		try (CustomClass cs = new CustomClass()) {
		}

	}

	public static void readFileBeforeJava7() throws IOException {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(fileName));
			String currentLine;
			while ((currentLine = br.readLine()) != null) {
				System.out.println(currentLine);
			}
		} finally {
			br.close();
		}
	}

	public static void readFIleWithJava7() throws FileNotFoundException, IOException {
		// Those class which implement AutoCloseable interface or if their parent implement AutoCloseable can be used in try with resource
		try (BufferedReader br = new BufferedReader(new FileReader(fileName));
				CustomClass cs = new CustomClass();) {
			// br = new BufferedReader(new FileReader(fileName)); This is essentially final as if we change the value JVM will know which one to close
			// so can't change value
			String currentLine;
			while ((currentLine = br.readLine()) != null) {
				System.out.println(currentLine);
			}
		}
	}
}

class CustomInt implements AutoCloseable {

	@Override
	public void close() throws IOException {
		System.out.println("We are closed");
	}

}

class CustomClass extends CustomInt {

}
