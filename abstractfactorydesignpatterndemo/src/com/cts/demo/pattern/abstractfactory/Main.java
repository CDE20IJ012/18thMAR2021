package com.cts.demo.pattern.abstractfactory;

public class Main {

	public static void main(String[] args) {
	
		//1 ) We require a reference of Factory we can have user's
		 // choice for whether we want to create a factory which 
		// will produces rounded corners or the factory with normal
		// corners
		AbstractFactory shapeFactory=FactoryProducer.getFactory("round");
		// As we have selected for normal so in shapeFactory,
		// we are having the reference of ShapeFactory
		Shape shape=shapeFactory.getShape("rectangle");
		shape.draw();

	}

}
