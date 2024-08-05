package JavaRecursion.Arrays;

// Write a recursive function to calculate the factorial of a number n.
public class FactorialCalculation {
    public static void main(String[] args){
        FactorialCalculation obj = new FactorialCalculation();

        int result = obj.factorial(5);
        System.out.println(result);
    }

    public int factorial(int num){
        if(num == 1){
            return num;
        }
       return factorial(num - 1) * num;
    }
}
