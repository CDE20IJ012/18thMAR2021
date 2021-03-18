package com.cts.demo.pattern.factory;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		    ShapeFactory shapeFactory=new ShapeFactory();
		    Scanner scanner=new Scanner(System.in);
		    Shape shape=null;
		    String choice=null;
            while(true)
            {
            	
            	  System.out.println("RECTANGLE\n SQUARE \n  EXIT");
            	  System.out.println("Enter your choice as text");
                  choice=scanner.next();
                  switch(choice)
                  {
                  case "rectangle" : shape=shapeFactory.createShape(choice);
                                      shape.draw();
                                      break;
                  case "square"    : shape=shapeFactory.createShape(choice);                    
                                     shape.draw();
                                     break;
                  case  "exit"      : System.exit(0);                 
                  }             
            }
	}

}
