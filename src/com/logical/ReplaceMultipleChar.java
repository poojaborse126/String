//a Program to Replace Multiple Characters in a String
package com.logical;

public class ReplaceMultipleChar {
	public static void main(String args[]) {

		String s = "Java Programming";

		s = s.replace('a', '@');
		s = s.replace('m', '#');
		s = s.replace('g', '*');

		System.out.println(s);
	}
}
