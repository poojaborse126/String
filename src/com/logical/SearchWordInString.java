package com.logical;

public class SearchWordInString {

	public static void main(String args[]) {

		String s = "Java is easy to learn";
		String search = "easy";

		if (s.contains(search)) {
			System.out.println("Word Found");
		} else {
			System.out.println("Word Not Found");
		}

	}
}
