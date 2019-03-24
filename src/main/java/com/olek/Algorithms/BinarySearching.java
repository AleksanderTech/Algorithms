package com.olek.Algorithms;

import java.util.Scanner;

public class BinarySearching {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int searched = scanner.nextInt();
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		int beginning = 0;
		int end = numbers.length - 1;
		int middle;
		while (end >= beginning) {
			middle = (beginning + end) / 2;
			if (numbers[middle] == searched) {
				System.out.println("Znaleziono");
				return;
			}
			if (numbers[middle] > searched) {
				end = middle - 1;
			} else if (numbers[middle] < searched) {
				beginning = middle + 1;
			}
		}
		System.out.println("Nie znaleziono");
		scanner.close();
	}
}
