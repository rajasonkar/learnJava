package com;

public class StaticMain {
	public static void main(String [] args){
		
		//to call static method ,just call it by class name
		StaticMethod.doSomeThing("Static ethod called");
		StaticMethod.age = 10;
		
		//while to call non satic method user need to create instance/object of th class
		StaticMethod sm = new StaticMethod();
		
		sm.doSomeThingElse("in non static block");
		
	
		
	}
}
