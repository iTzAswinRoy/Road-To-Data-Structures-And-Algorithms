package W3Resource.JavaBasics;
// Write a Java program to compute the sum of the first 100 prime numbers.
public class w66 {
    public static void main(String[] args) {
        w66 obj = new w66();
        obj.sumOfPrimeNumbers();
    }
    public boolean isPrime(int n){
        if(n <= 1) {
            return false;
        }
        if(n % 2 == 0){
            return false;
        }
        for (int i = 3; i < Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public void sumOfPrimeNumbers(){
        int number = 2;
        int count = 0;
        int sum = 0;
        while (count < 100){
            if(isPrime(number)){
                sum += number;
                count++;
            }
            number++;
        }
        System.out.println("The sum of first 100 prime numbers: "+sum);
    }
}


