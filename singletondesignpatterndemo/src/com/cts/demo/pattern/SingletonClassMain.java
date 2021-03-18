package com.cts.demo.pattern;

public class SingletonClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// The below line is not permissible as the constructor is
		// private 
		//SingletonClass obj=new SingletonClass();
		// In this we ensure that only one object is getting created
		SingletonClass obj=SingletonClass.createObject();
		
	}

}
