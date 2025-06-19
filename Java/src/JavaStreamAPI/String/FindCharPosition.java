package JavaStreamAPI.String;

import java.util.List;

public class FindCharPosition {
    public static void main(String[] args) {

    List<String> list = List.of("abab", "hoho", "abc", "abcd", "hello", "testtest", "tot");

    List<Integer> result = list.stream().map(String::toLowerCase).map(a-> a.indexOf('a')).toList();

    System.out.println(result);

    }
}