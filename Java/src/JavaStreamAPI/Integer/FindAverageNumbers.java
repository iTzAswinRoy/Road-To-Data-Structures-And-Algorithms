package JavaStreamAPI.Integer;

import java.util.List;
import java.util.Optional;

//Given a list of integers, use the Stream API to calculate the average of the numbers.
public class FindAverageNumbers {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);

        int avg = list.stream().reduce(0, (a,b)-> a+b)/ list.size();

        System.out.println(avg);
    }
}
