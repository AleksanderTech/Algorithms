package com.olek.Algorithms;
import java.util.Scanner;

public class CaesarEncryption {

	public static void main(String[] args) {
		CaesarEncryption ap = new CaesarEncryption();
		String input = ap.getInputFromUser();
		input = ap.encryptCaesar(input, 5, ' ', 'z');
		System.out.println(input);
	}

	public String getInputFromUser() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Wprowadz kod do zaszyfrowania: ");
		String input = scanner.nextLine();
		scanner.close();
		return input;
	}

	public String encryptCaesar(String input, int distance, char begin, char end) {
		for (int i = 0; i < input.length(); i++) {
			int c = (int) (input.charAt(i));
			if (c - distance < (int) begin) {
				c = (int) end - ((int)begin-(c-distance)-1); 
			} else {
				c = c - distance;
			}
			char[] chars = input.toCharArray();
			chars[i] = (char) c;
			input = new String(chars);
			System.out.println(input);
		}
		return input;
	}
}
