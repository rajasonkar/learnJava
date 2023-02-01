package com;

public class MethodOverLoadding {
	
	public static void main(String [] args){
		System.out.println(Add(4, 5));
		System.out.println(Add(4.5, 5.5));
		System.out.println(Add("Hello", " world"));
	}
public static int Add(int a, int b){
	return(a+b);
}
public static double Add(double a, double b){
	return(a+b);
}
public static String Add(String a, String b){
	return(a+b);
}
}
