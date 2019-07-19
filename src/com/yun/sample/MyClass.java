package com.yun.sample;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass outer = new OuterClass();
		outer.displayInner();
		
		outer.myMethod();
		
		OuterClass.InnerClass2 inner = outer.new InnerClass2();
		inner.print();
	}

}
