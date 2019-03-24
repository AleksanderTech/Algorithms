package com.olek.Algorithms.DictionariesAndHashmaps;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoStrings {

	static String twoStrings(String s1, String s2) {
		
		Set<Character> ss1 = new HashSet<>();
		Set<Character> ss2 = new HashSet<>();
		for (int i = 0; i < s1.length(); i++) {
			ss1.add(s1.charAt(i));
		}
		for (int i = 0; i < s2.length(); i++) {
			ss2.add(s2.charAt(i));
		}
		ss1.retainAll(ss2);
		return ss1.isEmpty() ? "NO" : "YES";
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int qItr = 0; qItr < q; qItr++) {
			String s1 = scanner.nextLine();

			String s2 = scanner.nextLine();

			String result = twoStrings(s1, s2);

			bufferedWriter.write(result);
			bufferedWriter.newLine();
		}

		bufferedWriter.close();

		scanner.close();
	}
}
