package com.olek.Algorithms;


public class SumOfArrayElements {

	public static void main(String[] args) {
		int sum = 0;
		int[] table = { 2, 5, 4, 6, 7, 2,7,6,4 };
		for (int i = 0; i < table.length; i++) {
			sum = sum + table[i];
		}
		System.out.println(sum);
	}
}
