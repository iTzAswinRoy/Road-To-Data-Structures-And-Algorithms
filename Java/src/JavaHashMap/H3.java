package JavaHashMap;

import java.util.ArrayList;//
import java.util.HashMap;//

// Given two arrays, return their intersection. Use hash maps to count occurrences of elements.
public class H3 {//
    public ArrayList<Integer> intersectionElements(int[] data1, int[] data2) {//
        HashMap<Integer, Integer> mapCount = new HashMap<>();//

        ArrayList<Integer> intersection = new ArrayList<>();

        for (int i = 0; i < data1.length; i++) {//

            mapCount.put(data1[i], mapCount.getOrDefault(data1[i], 0) + 1);//

        }

        for (int i = 0; i < data2.length; i++) {//

            if(mapCount.containsKey(data2[i]) && mapCount.get(data2[i]) > 0) {//
                intersection.add(data2[i]);
                mapCount.put(data2[i], mapCount.get(data2[i]) - 1);     // This avoids repeated elements
            }
        }

        return intersection;//
    }
    public static void main(String[] args) {//
        H3 obj = new H3();//
        int[] num1 = {1, 5, 3, 9};//
        int[] num2 = {3, 3, 9, 7, 2, 9, 1};//

        ArrayList<Integer> result = obj.intersectionElements(num1, num2);//
        System.out.println(result);//
    }
}
//////