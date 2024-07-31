package JavaRecursion;

// Implement a recursive function to find the n-th Fibonacci number.
public class FibonacciSequence {
    public static void main(String[] args) {
        FibonacciSequence obj = new FibonacciSequence();

        int result = obj.findFibonacciNumber(5);
        System.out.println(result);
    }
    public int findFibonacciNumber(int num){
        if(num == 0){
            return 0;
        }
        if(num == 1){
            return 1;
        }
        return findFibonacciNumber(num - 1) + findFibonacciNumber(num - 2);
    }
}
