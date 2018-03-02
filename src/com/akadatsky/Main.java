package com.akadatsky;

public class Main {

    private static final long TEST_NUMBER = 2971215073L;

    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        System.out.println("Test number: " + TEST_NUMBER + ", " + isPrime(TEST_NUMBER));
        time = System.currentTimeMillis() - time;
        System.out.println("Time: " + time / 1000.0);
    }

    private static boolean isPrime(long number) {
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (long i = 3; i*i <= number; i+=2) {
            if (number % i == 0) {
                System.out.println("div: " + i);
                return false;
            }
        }
        return true;
    }
}
