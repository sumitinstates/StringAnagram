package com.sumit;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Anagram {
	
	
	//without set
	boolean checkAnagram(String s1, String s2) {
		
		if(s1.length()!=s2.length()) {
			return false;
		}
		
		char[] charArray1 = s1.toCharArray();
		char[] charArray2 = s2.toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		
		for(int i=0;i<charArray1.length;i++) 
		{
			if(charArray1[i]!=charArray2[i])
			{
				return false;
			}
		}
		
		return true;
		
	}
	
	//with set
      boolean checkAnagramInSet(String s1, String s2) {
		
		if(s1.length()!=s2.length()) {
			return false;
		}
		
		Set<Character> set = new HashSet<>();
		
		for(int i=0;i<s1.length();i++) 
		{
			if(!set.contains(s1.charAt(i))) {
				set.add(s1.charAt(i));
			}
			
		}
		
		for(int i=0;i<s2.length();i++) 
		{
			if(!set.contains(s2.charAt(i))) 
			{
				return false;
			}
			
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		String s1 = "wats";
		String s2 = "swat";
		
		Anagram a = new Anagram();
		boolean checkAnagram = a.checkAnagramInSet(s1, s2);
		
		if(checkAnagram) 
		{
			System.out.println("String is anagram");
		}
	}

}
