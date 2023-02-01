package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Set<String>> resultList = new HashSet<Set<String>>();
      String[] str= {"eat","tea","tan","ate","nat","bat"};
      List<String> listStr = Arrays.asList(str);
      Collections.sort(listStr);
      List<Map<Character,Integer>> listOfMap = new ArrayList<Map<Character,Integer>>();
      for(int i=0;i<listStr.size();i++)
      {
    	  int count =0;
    	  LinkedHashMap<Character, Integer> hmi = new LinkedHashMap<>(); 
    	  for(int j=0;j<listStr.get(i).length();j++){  
    	  count = hmi.getOrDefault(listStr.get(i).charAt(j), 0);
    	  count++;
    	  hmi.put(listStr.get(i).charAt(j), count);
    	  }
    	  listOfMap.add(hmi);
    	  }
      for(int k=0;k<listOfMap.size();k++)
      {
    	  Set<String> al = new HashSet();
		  al.add(listStr.get(k));
    	  for (int l=0;l<listOfMap.size();l++){
    	  if(listOfMap.get(k).equals(listOfMap.get(l)))
    	  { 
    		  al.add(listStr.get(l));
    	  }
      }
    	  resultList.add(al);
      }
      System.out.println(resultList);
	}

}
