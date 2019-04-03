package org.springframework.core;

public class Test {

	public static void assertTest(String name, String alias) {
		assert !name.equals("");
		assert !alias.equals("");
	}

	public static void main(String[] args) {
		String s = null;
		assert s != null ? true : false;
		assert false;
		System.out.println("end");
	}
}
