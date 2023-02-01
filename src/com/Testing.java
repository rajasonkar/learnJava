package com;

public class Testing {
	public static void main(String args[])
	{
		System.out.println(countHi("sdvhihdvhihisxfcgsdhhgsihi"));
		
		int i,c=0;
		for( i=0;i<=10;i++)
		{
			c++;
			System.out.println(i);
		}
		System.out.println(c+"    "+i);
	}
	public static int countHi(String str) {
		  int count =0;
		  for(int i=0;i<str.length();i++)
		  {
			  String s1= str.charAt(i)+"";
			  String s2="";
			  if(i+1<str.length())
			  s2= str.charAt(i+1)+"";
		    if(s1.equalsIgnoreCase("h")&&s2.equalsIgnoreCase("i"))
		    {count++;}
		  }
		  return count;
		}
}
