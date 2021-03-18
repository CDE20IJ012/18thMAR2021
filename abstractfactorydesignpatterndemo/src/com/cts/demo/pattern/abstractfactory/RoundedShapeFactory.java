package com.cts.demo.pattern.abstractfactory;


public class RoundedShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(String typeOfShape) {
		 if(typeOfShape.equalsIgnoreCase("rectangle"))
		   {
			   return new RoundedRectangle();
			   
		   }
		   else if(typeOfShape.equalsIgnoreCase("square"))
		   {
			   return new RoundedSquare();
		   }
		   
		   return null;
	   }
		
	}


