package W3Resource.JavaBasics;

import java.util.Scanner;

// Write a Java program to print the number of prime numbers less than or equal to a given integer.
public class W217 {
    public static void main(String[] args) {
        W217 obj = new W217();
        int primeNumber = obj.userInputs();
        obj.countPrime(primeNumber);
    }
    public int userInputs(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the prime number:");
        return in.nextInt();
    }
    public boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        if (num == 2){
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public void countPrime(int num) {
        int count = 0;
        if (!isPrime(num)) {
            System.out.println("Not a prime number");
        } else {
            for (int i = 2; i <= num; i++) {
                if (isPrime(i)) {
                    count++;
                }
            }
            System.out.println("No. of prime numbers in the given number: "+ count);
        }
    }
}
