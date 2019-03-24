package com.olek.Algorithms;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class AbsoluteValue 
{
    public static void main( String[] args )
    {
		int x;
		Scanner scanner = new Scanner(System.in);
		System.out.println("wprowadz liczbe");
		x = scanner.nextInt();
		if(x<0) {
			x=x*(-1);
		}
		System.out.println(x);
		scanner.close();
    }
}
