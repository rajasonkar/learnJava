package com;

public final class InnerCocept {

	class inner{
		
		void test(){
			if(InnerCocept.this.flag){sample();}
		}
		
	}
	private boolean flag= true;
public void sample(){System.out.println("sample");}
public  InnerCocept()
{
	(new inner()).test();
	}

public static void main(String [] args){new InnerCocept();}
}
