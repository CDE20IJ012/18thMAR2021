package com.cts.demo.pattern;

public class SingletonClass {

	private static SingletonClass singletonObject;

	// So keeping the constructor as private 
	// so that we cannot create an object of the class 
	// outside the class
      private SingletonClass()
      {
    	  //singletonObject=null;
      }

      public static SingletonClass createObject()
      {
    	  if(singletonObject==null)
    	  {
    		  singletonObject=new SingletonClass();
    	  }
         return singletonObject;
      }
      
}
