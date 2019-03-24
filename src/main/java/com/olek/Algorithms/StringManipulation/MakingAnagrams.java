package com.olek.Algorithms.StringManipulation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MakingAnagrams {

	static int makeAnagram(String a, String b) {
		int deletions = 0;
		int[] aFrequency = new int[26];
		int[] bFrequency = new int[26];

		for (int i = 0; i < a.length(); i++) {
			char currentChar = a.charAt(i);
			int charInt = (int) currentChar;
			int position = charInt - (int) 'a';
			aFrequency[position]++;
		}
		for (int i = 0; i < b.length(); i++) {
			char currentChar = b.charAt(i);
			int charInt = (int) currentChar;
			int position = charInt - (int) 'a';
			bFrequency[position]++;
		}
		for (int i = 0; i < 26; i++) {
			int difference = Math.abs(aFrequency[i] - bFrequency[i]);
			deletions = deletions + difference;
		}
		return deletions;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String a = scanner.nextLine();

		String b = scanner.nextLine();

		int res = makeAnagram(a, b);

		bufferedWriter.write(String.valueOf(res));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
