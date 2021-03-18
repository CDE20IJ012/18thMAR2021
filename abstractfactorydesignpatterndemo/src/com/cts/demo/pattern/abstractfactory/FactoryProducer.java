package com.cts.demo.pattern.abstractfactory;

public class FactoryProducer {

	public static AbstractFactory getFactory(String typeOfFactory)
	{
		if(typeOfFactory.equals("round"))
		{
			return new RoundedShapeFactory();
		}
		else if(typeOfFactory.equals("normal"))
		{
			return new ShapeFactory();
		}
		return null;
	}
	
}
