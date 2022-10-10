package java101;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class challenge3 {

	//numan -> n2u1m1a1 Numan karaaslan n3u1m1a5 1k1r1s1l1

	 
	public static void main(String[] args) {
		ArrayList<Character> liste = new ArrayList<>();
		LinkedHashMap<Character, Integer> characterCount = new LinkedHashMap<Character, Integer>();
		Scanner scn = new Scanner(System.in);
		System.out.print("Lütfen metin giriniz: ");
		String metin = scn.nextLine();
		for (int i = 0; i < metin.length(); i++) {
			liste.add(metin.charAt(i));
		}
		for (Character c : liste) {
			if (characterCount.containsKey(c)) {
				characterCount.put(c, characterCount.get(c) + 1);
			} else {
				characterCount.put(c, 1);
			}
		}
		for (Entry<Character, Integer> entry : characterCount.entrySet()) {
			System.out.print(entry.getKey() + "" + entry.getValue());
		}
		scn.close();
	}
}