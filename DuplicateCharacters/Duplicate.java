package com.duplicatecharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {

		duplicate("programming");
	}

	private static void duplicate(String word) {
		char[] charArray = word.toCharArray();
		Map<Character,Integer> map=new HashMap<>();
		for(Character c:charArray) {
			if(map.containsKey(c)) {
				map.put(c,map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		
		Set<Entry<Character,Integer>> entrySet = map.entrySet();
		for(Map.Entry<Character, Integer> entry:entrySet) {
			System.out.println(entry.getKey()+"       "+entry.getValue());
		}
	}

}
