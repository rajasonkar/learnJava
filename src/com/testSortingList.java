package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class testSortingList {

	public static void main(String args[])
	{
		List<Integer> l = new ArrayList<Integer>();
		int[] array={8,6,20,5,80,11,5,8,0,100};int[] array2={9,2,11,2,20,100,60,70,80,46};
		System.out.println("wdw "+findMedianSortedArrays(array,array2));
	}
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Double> l = new ArrayList<Double>();
        int i=0,j=0;
        while(i<nums1.length)
        {
            l.add((double) nums1[i]);
            i++;
        }
        while(j<nums2.length)
        {
            l.add((double) nums2[j]);
            j++;
        }
      //  Collections.sort(l);
        ArrayList<Double> d= new ArrayList<>();
        d.add(l.get(0));
        for(int r=1;r<l.size();r++)
        {
        	for(int s=0;s<d.size();s++)
        	{
        		System.out.println(l.get(r)+" "+d.get(s));
        		if(l.get(r)<=d.get(s))
        		{
        			d.add(s, l.get(r));
        			break;
        		}else if(s==d.size()-1)
        		{
        			d.add(l.get(r));
        			break;
        		}
        	}
        }
        System.out.println(d);
        if(l.size()%2==1)
        {
            return l.get(l.size()/2);
        }else
        {
            if(l.size()%2==0)
            {
               int k= l.size()/2;
                return (l.get(k)+l.get(k-1))/2;
            }
        }
         return 0.0; 
    }
	 }
