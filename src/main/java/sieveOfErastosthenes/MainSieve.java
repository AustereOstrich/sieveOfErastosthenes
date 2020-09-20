package sieveOfErastosthenes;

import java.util.ArrayList;
import java.util.Scanner;

public class MainSieve {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the sieve. Please enter an integer, and I will show you all the prime numbers less than or equal to it:");
		int maxInt = scanner.nextInt();
		System.out.println(isPrime(maxInt).toString());
		System.out.println("There you go!");
	}

	public static ArrayList<Integer> isPrime(int number) {
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
		primeNumbers.add(1);
		for (int i = 2; i <= number; i++) {
			boolean isPrime = true;
			for (int x = 2; x < i; x++) {
				if (i % x == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				primeNumbers.add(i);
			}
		}
		return primeNumbers;
	}
}
