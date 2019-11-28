package com.javaupdates;

/**
 * 
 * @author Programmer
 *
 */
public class HelloWorldInJava8 {

	public static void main(String[] args) {
		HelloWorldPrintInterface hwpi = () -> System.out.println("Hello World");
		hwpi.printHelloWorld();
		
	}//end of the method

}//end of the class
