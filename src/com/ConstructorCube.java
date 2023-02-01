package com;

public class ConstructorCube {
	
	int length = 0, breadth = 0 , height = 0;
	public int getCubeVolume(){
	
		return (length*breadth*height);
		}

	 ConstructorCube() {
System.out.println("we are in constructor");
	
	 length =20;
	 
	 breadth =30;
	height =10; 	 
	 }
	//constructor overloading
	 ConstructorCube(int l, int b , int h) {
		 length =l;breadth =b; height =h;
	 }
	
}
