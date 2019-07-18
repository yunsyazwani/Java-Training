package com.yun.sample;

public class FinalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalClass.sayHi("Java");
		
		FinalClass obj = new FinalClass();
		FinalClass obj2 = new FinalClass();
		
		obj.sayHi("Java");
		obj.sayBye("Java");
		
		obj2.sayHi("Java obj2");
		obj2.sayBye("Java obj2");
		
		System.out.println(obj.ClassName);
		System.out.println(obj.ClassName2);
		
		System.out.println(obj2.ClassName);
		System.out.println(obj2.ClassName2);
	
		obj.ClassName = "MyClass1";
		obj.ClassName2 = "MyClass2";
				
		obj2.ClassName = "MyClass1 obj2";
		obj2.ClassName2 = "MyClass2 obj2";
		
		System.out.println("Modified 1 : " + obj.ClassName);
		System.out.println("Modified 1 : " + obj.ClassName2);
		
		System.out.println("Modified 2 : " + obj2.ClassName);
		System.out.println("Modified 2 : " + obj2.ClassName2);


	}

}
