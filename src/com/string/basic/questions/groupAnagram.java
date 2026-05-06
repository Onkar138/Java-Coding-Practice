package com.string.basic.questions;

import java.util.*;

public class groupAnagram {

	public static void main(String[] args) {
		String[] strs= {"eat", "tea", "tan", "ate", "nat", "bat"};
		checkAnagram(strs);
	}

	public static void checkAnagram(String[] strs) {
		Map<String, List<String>> map=new HashMap<>();
		
		for (String str : strs) {
			char[] ch = str.toCharArray();
			Arrays.sort(ch);
			
			String key=new String(ch);
			map.putIfAbsent(key, new ArrayList<>());
			map.get(key).add(str);
		}
		System.out.println(new ArrayList<>(map.values()));
	}
}
