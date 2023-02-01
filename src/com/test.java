package com;

public class test {

public test(String string) {
	
}

public static void main(String[] args) {

	// TODO Auto-generated method stub
/*String s1 = "abc";
String s2 = "abc";
String s3 =new String("abc");
s1.equals(s2);
s1.equals(s3);
System.out.println(s1==s2);
System.out.println(s1==s3);*/
	
		String s1 = new String("abc");
		String s2 = new String("abc");
		String s= "abc";
	    System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		//System.out.println(s==s1);
		//System.out.println(s==s2);
		
		test tc = new test("abc");
		test tc2 = new test("abc");
		System.out.println(tc==tc2);
	}

}
