package com.bits.assignment;

/**
 * @see This class is used to show the fibonacci series number
 * @author VIVEK BALACHANDRAN
 * @version 1.0
 */
//This is a Fibonacci Series Program

public class Fibonacci {

    public static void main(String[] args) {

        int n = 10, t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}