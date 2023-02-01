package com;
public class ConstructorTest {
int a,b;


 
 ConstructorTest(int a,int b) {
	 this.a=a;
	 this.b=b;
		System.out.println("parent");
}

public static void main (String args[]){
	ConstructorTest t = new ConstructorTest(10,20); 
	
	System.out.println(t.a+t.b);
}
}