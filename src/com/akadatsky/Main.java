package com.akadatsky;

public class Main {

    public static void main(String[] args) {
        System.out.println("Test Primes");
        System.out.println("Test number 13: " + isPrime(13));
        System.out.println("Test number 15: " + isPrime(15));
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
