package de.dhbw.tinf12.exceptional;

import java.io.FileInputStream;
import java.io.IOException;


public class Main {

	public static void main(String[] args) {
		try {
			doSomething();
		} catch (NullPointerException e) {
			e.getCause().printStackTrace();
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * We are minimal exception safe
	 */
	protected static void doSomething() throws IOException {
		FileInputStream stream = null;
		try {
			stream = new FileInputStream("C:/temp/test.txt");
			System.out.println("hello");
		} finally {
			if (null != stream) {
				stream.close();
			}
		}
	}
}