package com.string.basic.questions;

public class rotationString {

	public static void main(String[] args) {
		String str1="abcd";
		String str2="abc";

		checkContainsString(str1,str2);
	}

	public static void checkContainsString(String str1, String str2) {
		
		if (str1.length()!=str2.length()) {
			System.out.println(false);
			return;
		}
		
		String str=str1+str1;
		if (str.contains(str2)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
