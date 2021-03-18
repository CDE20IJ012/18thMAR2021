package com.cts.demo.pattern.factory;

public class ShapeFactory {

	   public  Shape  createShape(String typeOfShape)
	   {
		   if(typeOfShape.equalsIgnoreCase("rectangle"))
		   {
			   return new Rectangle();
			   
		   }
		   else if(typeOfShape.equalsIgnoreCase("square"))
		   {
			   return new Square();
		   }
		   
		   return null;
	   }
	
}
