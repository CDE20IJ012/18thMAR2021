package com.cts.demo.pattern.abstractfactory;


public class ShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(String typeOfShape) {
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


