package com.bits.assignment;

public class ReverseTheNumber {

	private static final NUM=1234;

	public static void main(String[] args) {

		int num = NUM, reversed = 0;

		while (num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num /= 10;
		}

		System.out.println("Reversed Number: " + reversed);
	}
}
