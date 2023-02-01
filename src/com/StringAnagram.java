package com;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(anagram("keep" , "peeek"));
	}
public static String anagram(String anagramFirst , String anagarmSecond)
{
	if(anagramFirst.isEmpty()||anagramFirst.equals("")
			||anagarmSecond.isEmpty()||anagarmSecond.equals(""))
	{
		return "not anagram";
	}
	else
	{
		char c1[] =anagramFirst.toLowerCase().toCharArray();
		char c2[] = anagarmSecond.toLowerCase().toCharArray();
		//Arrays.sort(c1);
		//Arrays.sort(c2);
	//	System.out.println(" dd "+c1[1]);
		HashMap<Character, Integer> hm = new HashMap<>();
		  for(int i=0;i<c1.length;i++){
			  //int count =0;
		int count=  hm.getOrDefault(c1[i],0);
		  count++;
		  hm.put(c1[i], count);
		  
		  }System.out.println(hm);
		  HashMap<Character, Integer> hm2 = new HashMap<>();
		  for(int i=0;i<c2.length;i++){
			  //int count =0;
		int count=  hm2.getOrDefault(c2[i],0);
		  count++;
		  hm2.put(c2[i], count);
		  ;
		  }
		  System.out.println(hm2);
		System.out.println(hm.equals(hm2));
		Arrays.asList(c1);
		Arrays.asList(c2);
		
		if(Arrays.equals(c1, c2));
		//	return "is anagram";
	}
	  Stream<Object> st =Stream.of(1,2,53,4,5);
	  System.out.println(st.sorted().collect(Collectors.toList()));
	  
	  
	
	return "";
}
}
