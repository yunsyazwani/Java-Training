package com.yun.sample;

public class TestClass implements Inf2 {

	@Override
	public String whoAmI() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void testIt() {
		// TODO Auto-generated method stub
		System.out.println("Test It");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("INside testclass main");
		System.out.println(name);
		TestClass test = new TestClass();
		test.testIt();
		System.out.println(Inf2.name);
	}

}
