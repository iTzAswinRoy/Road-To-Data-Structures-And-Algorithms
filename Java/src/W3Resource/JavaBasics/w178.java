package W3Resource.JavaBasics;
import java.util.ArrayList;
import java.util.Scanner;
// Write a Java program to find the longest increasing continuous subsequence in a given array of integers.
public class w178 {
    public static void main(String[] args) {
        w178 obj = new w178();      // Creating class object
        ArrayList<Integer> result = obj.userInputs();   // Storing the result in a variable by calling the input method
        System.out.println("The longest increasing continuous subsequence in a given array of integers\n"+obj.continuousSubsequence(result));
    }

    public ArrayList<Integer> userInputs() {     // Method to get user inputs
        Scanner in = new Scanner(System.in);      // Creating a scanner object
        ArrayList<Integer> temp = new ArrayList<>();    // Creating an array list
        System.out.println("Enter the size of the array:");
        int size = in.nextInt();    // Getting the size using scanner object
        System.out.println("Enter the values of the array list:");
        for (int i = 0; i < size; i++) {    // Iterating over the array
            temp.add(in.nextInt());     // Adding elements for each iteration of the array list
        }
        in.close();     // Closing scanner
        return temp;
    }
    public int continuousSubsequence(ArrayList<Integer> data){
//        ArrayList<Integer> temp = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < data.size(); i++) {
            for (int j = data.size(); j > 0 ; j--) {

            }
            if (data.get(i) > data.get(i+1)){
//                temp.add(data.get(i));
                count++;
            } else if (data.get(i) < data.get(i+1)){
                count++;
            }
        }
        return count;

    }
}
