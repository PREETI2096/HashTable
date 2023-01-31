package com.bridgelabz.hashtable;

public class HashTest {
	public static void main(String[] args) {
		String str = "Paranoids are not paranoid because " + "they are paranoid but because they keep "
				+ "putting themselves deliberately into paranoid " + "avoidable situations";

		HashTable hash = new HashTable();
		hash.countWords(str);
		hash.remove("avoidable");
	}
}
