package com;

public class Main {
	
	String a;
	Main(String a)
	{
		this.a = a;
	}

public static void main(String[] args){
	/*StringBuilder sb1 = new StringBuilder("abc");
	StringBuilder sb2 = sb1;
	sb1.append("d");
	
	
	Object sb = null;
	System.out.println(sb.equals(sb1));
	System.out.println(sb1.equals(sb2));
	System.out.println(sb.equals(sb2));*/
     int[] nums ={1,1,2};
	int[] temp = new int[nums.length];
    int k=1;
    temp[0] = nums[0];
    for(int i=1;i<nums.length;i++)
    {
        for(int j=0; j<i;j++)
        {
            if(nums[i]==temp[j])
            {
                break;
            }
            else{
             k++;   
            }
        }

    }
    System.out.println(k);}
}
