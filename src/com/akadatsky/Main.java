package com.akadatsky;

public class Main {

    public static void main(String[] args) {
        System.out.println("Test Primes");
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
                break;
            }
        }
        return true;
    }
}
