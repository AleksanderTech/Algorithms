package com.olek.Algorithms;

public class CountingInstancesInArray {

	public static void main(String[] args) {
		int[] table = { 6, 4, 2, 8, 4, 4, 5, 6, 4, 3, 4, 5, 4 };
		int instances = 0;
		int searched = 4;
		for (int i = 0; i < table.length; i++) {
			if (table[i] == searched) {
				instances++;
			}
		}
		System.out.println(instances);
	}

}
