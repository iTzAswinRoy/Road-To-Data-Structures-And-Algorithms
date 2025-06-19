//package JavaxIQ;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class WordPattern {
//    public static void main(String[] args) {
//        String pattern = "abba";
//        String str = "dog cat cat dog";
//
//
//        char[] ch = pattern.toCharArray();
//
//        Map<Character, String> map = pattern.chars().mapToObj(c -> (char) c).distinct()
//                .collect(Collectors.groupingBy(c-> c, str.split(" ")));
//
//        System.out.println(map.values());
//    }
//}
