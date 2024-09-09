//package JavaHashMap;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//
//// Given two arrays, return their intersection. Use hash maps to count occurrences of elements.
//public class H3 {
//    public ArrayList<Integer> intersectionElements(int[] data1, int[] data2) {
//        HashMap<Integer, Integer> map1 = new HashMap<>();
//        HashMap<Integer, Integer> map2 = new HashMap<>();
//
//        ArrayList<Integer> intersection = new ArrayList<>();
//
//        for (int i = 0; i < data1.length; i++) {
//            map1.put(data1[i], data1.);
//        }
//
//        for (int i = 0; i < data2.length; i++) {
//            map2.put(i, data2[i]);
//
//        }
//
//        for (int i = 0; i < map1.size(); i++) {
//
//            if(map1.containsValue(map2.get(i))) {
//                intersection.add(map1.get(i));
//            }
//        }
//
//        return intersection;
//    }
//    public static void main(String[] args) {
//        H3 obj = new H3();
//        int[] num1 = {1, 5, 3, 9};
//        int[] num2 = {3, 7, 2, 9, 1};
//
//        ArrayList<Integer> result = obj.intersectionElements(num1, num2);
//        System.out.println(result);
//    }
//}
