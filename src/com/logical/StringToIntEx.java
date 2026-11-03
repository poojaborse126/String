//Program for Convert String to int by using inbuilt method 

package com.logical;

public class StringToIntEx {
	public static void main(String[] args) {
		// declare String object
		String str = new String("10");

		/*
		 * use parseInt method of Integer class to convert String into int primitive
		 * data type. This is a static method. Please note that this method can throw a
		 * NumberFormatException if the string is not parsable to int.
		 */

		int i = Integer.parseInt(str);
		System.out.println(i);
	}
}
