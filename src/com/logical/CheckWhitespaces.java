package com.logical;

public class CheckWhitespaces {
	public static void main(String args[]) {

		String s = "     ";

		if (s.trim().isEmpty()) {
			System.out.println("Only Whitespaces");
		} else {
			System.out.println("Not Only Whitespaces");
		}
	}
}
