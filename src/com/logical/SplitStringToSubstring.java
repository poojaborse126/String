package com.logical;

public class SplitStringToSubstring {
	public static void main(String args[]) {

		String s = "Java is easy to learn";

		String arr[] = s.split(" ");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
