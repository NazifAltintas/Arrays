package be.intecbrussel.exercises;

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        int[] primes = new int[200];
        int index = 0;

        for (int number = 2; number <200; number++) {
            if (isPrime(number)) {
                primes[index++] = number;
            }
        }
        System.out.println(Arrays.toString(primes));
    }

    public static boolean isPrime(int number) {
        for (int divider = 2; divider < number; divider++) {
            if (number % divider == 0) {
                return false;
            }
        }
        return true;
    }
}


