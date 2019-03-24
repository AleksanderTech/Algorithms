package com.olek.Algorithms;

import java.util.Scanner;

public class FindingSpecifiedElement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Wprowadz liczbę : ");
		int searched = scanner.nextInt();
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7 };
		boolean isHere = false;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == searched) {
				isHere = true;
			}
		}
		if (isHere) {
			System.out.println("Liczba znajduje się w podanym zbiorze.");
		} else {
			System.out.println("Liczba nie znajduje się w podanym zbiorze.");
		}
		scanner.close();
	}

}
