package com.bits.assignment;

/**
 * @see This class is used to find the given number is prime number or not
 * @author VIVEK BALACHANDRAN
 * @version 1.0
 */
public class FindPrimeNumber {

	  public static void main(String[] args) {

	    int num = 29;
	    boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	      // condition for nonprime number
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	  }
	}
