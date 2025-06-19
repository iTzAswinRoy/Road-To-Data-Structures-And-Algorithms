package JavaStreamAPI.Integer;

import java.util.List;

public class CheckSize {
    public static void main(String[] args) {


        List<Integer> list = List.of(1, 1, 2, 3, 4, 5);

        boolean avg = list.stream().distinct().toList().size() < list.size();

        System.out.println(avg);
    }
}
