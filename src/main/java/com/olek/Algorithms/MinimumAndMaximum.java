package com.olek.Algorithms;

import java.io.IOException;

public class MinimumAndMaximum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] table = {-5,-6,-1,-112 };
		int dummy;
		int minimum=table[0];
		int maximum=table[0];
		for (int i = 0; i < table.length; i++) {
			dummy = table[i];
			if (dummy < minimum) {
				minimum = dummy;
			} else if (dummy > maximum) {
				maximum = dummy;
			}
		}
		System.out.println("Minimum: " + minimum);
		System.out.println("Maximum: " + maximum);
	}

}
