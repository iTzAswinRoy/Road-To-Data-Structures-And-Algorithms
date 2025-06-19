package JavaStreamAPI.Integer;

import java.util.List;
import java.util.stream.Collectors;

public class CheckDuplicates {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,1,2,2,3,3,4,4,5,5);

        boolean avg = list.stream().distinct().toList().size() < list.size();

        System.out.println(avg);
    }
}