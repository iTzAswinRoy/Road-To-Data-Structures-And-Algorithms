package W3Resource.JavaBasics;

import java.util.ArrayList;
import java.util.Scanner;

// Extract the prime numbers from the array and display the same.
// Also display the sum of the prime numbers displayed
public class I2 {
    public static void main(String[] args) {
        I2 obj =new I2();
        int[] arr = obj.userInput();
        System.out.println("Prime numbers:\n"+obj.displayPrime(arr));
        System.out.println("Sum of prime numbers: "+obj.sumOfPrime(arr));
    }
    public int[] userInput() {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the size");
        int size = in.nextInt();
        int[] temp = new int[size];
        System.out.println("Enter the values:");
        for (int i = 0; i < size; i++) {
            temp[i] = in.nextInt();
        }
        return temp;
    }
    public boolean checkPrime(int num){
        if(num <= 1){
            return false;
        }
        if(num == 2) {
            return true;
        }
        if(num % 2 == 0){
            return false;
        }
        for (int i = 3; i < Math.sqrt(num); i+= 2) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public ArrayList<Integer> displayPrime(int[] num){
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            if(checkPrime(num[i])){
            temp.add(num[i]);
            }
        }
        return temp;
    }
    public int sumOfPrime(int[] num){
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            if(checkPrime(num[i])){
                sum += num[i];
            }
        }
        return sum;
    }
}
