package W3Resource.JavaBasics;

import java.util.Scanner;

//  Write a Java program to calculate the position of a given prime number.
public class W198 {
    public static void main(String[] args) {
        W198 obj = new W198();
        int primNumber = obj.userInputs();
        System.out.println(" postion of prime numbre "+obj.findPrimePosition(primNumber) );
    }

    public int userInputs() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
    public Boolean checkPrime(int number){
        if(number <= 1){
            return false;
        }
        if(number == 2 || number == 3){
            return true;
        }
        for (int i = 3; i < Math.sqrt(number); i++) {
            if(number % i == 0){
                return false;
            }
        }
        return true;

    }
    public int findPrimePosition(int value){
        int count = 0;
        int position = 1;
        while (count < position){
            position++;
            if(checkPrime(value)){
                count++;
            }
        }
        return position;
    }
}

