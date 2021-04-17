package com.bits.assignment;

public class ReverseTheNumber {

	public static void main(String[] args) {

		int num = 456789, reversed = 0;
		int final;

		while (num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num /= 10;
		}
		final = reversed;

		System.out.println("Reversed Number: " + reversed);
	}
}
