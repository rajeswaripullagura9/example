package com.raji;

import java.util.Scanner;

public class Checkpolidrome {

	public static void main(String[] args) {
//		String reverse= "";
//		System.out.println("enter your polindrome:");
//		Scanner scanner = new Scanner(System.in);
//		String string = scanner.next();
//		for (int i = string.length() - 1; i >= 0; i--) {
//			reverse = reverse + string.charAt(i);
//
//		}
//		if (string.equals(reverse)) {
//			System.out.println(reverse + "  is polindrome");
//		} else {
//			System.out.println("given string is not polindrome");
//		}

		String s = "radar";
		int length = s.length();
		String rev = "";
		for (int i = length - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		if(s.equals(rev)) {
			System.out.println("polindrone");
		}
		else {
			System.out.println("not polindrome");
		}
	}

}
