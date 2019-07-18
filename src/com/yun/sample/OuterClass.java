package com.yun.sample;

public class OuterClass {

	int num =175;
	
	private class InnerClass{
		public void print(){
			System.out.println("This is an of inner class");
		}
	}
	
	public class InnerClass2{
		public int print(){
			System.out.println("This is an get numbr of inner class");
			return num;
		}
	}
	
	void myMethod(){
		class InnerClass3{
			public void print(){
				System.out.println("This is an inner class 3 inside myMethod");			}
		}
		InnerClass3 inner = new InnerClass3();
		inner.print();
	}
	
	void displayInner(){
		InnerClass inner = new InnerClass();
		inner.print();
	}
}
