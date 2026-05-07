package com.string.basic.questions;

public class reversWord {

	public static void main(String[] args) {
		String str="Hello Java Word"; 
		reverseWord(str);
		//		StringBuilder sb=new StringBuilder();
	}

	public static void reverseWord(String str) {
		String[] words=str.split(" ");

		for (int i = words.length - 1; i >= 0; i--) {
			StringBuilder sb = new StringBuilder(words[i]);
			System.out.print(sb.toString()+ " ");
		}
	}

}
