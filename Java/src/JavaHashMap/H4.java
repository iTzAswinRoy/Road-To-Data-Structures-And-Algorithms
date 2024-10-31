//package JavaHashMap;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//
//// Given an array of integers, return the k most frequent elements. Use a hash map to count frequencies.
//public class H4 {
//    public int[] frequentElements(int[] data) {
//        HashMap<Integer, Integer> mapCount = new HashMap<>();
//
//        for (int i = 0; i < data.length; i++) {
//            mapCount.put(data[i], mapCount.getOrDefault(data[i], 0) +1);
//        }
//
//        int[] result = new int[k];
//        for (int i = 0; i < k; i++) {
//            result[i] = bubbleSort(data).get(i).getKey();
//        }
//        return result;
//
//    }
//    public ArrayList<Integer> bubbleSort(HashMap<Integer, Integer> data) {
//        HashMap<Integer, ArrayList<Integer>> test = new HashMap<>();
//        for (int i = 0; i < data.size(); i++) {
//            if (data.get(i) > data.get(i + 1)) {
//                Integer temp = data.get(i);
//                data.get(i) = data.get(i + 1);
//                data.get(i + 1) = temp;
//            }
//        }
//
//
//    }
//
//    public static void main(String[] args) {
//        H4 obj = new H4();
//        int[] num = {5, 11, 10, 50, 99, 12};
//        ArrayList<Integer> result = obj.frequentElements(num);
//        System.out.println(result);
//
//    }
//}
