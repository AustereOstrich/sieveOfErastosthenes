package sieveOfErastosthenes;

import java.util.ArrayList;

public class SecondarySieve {

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
