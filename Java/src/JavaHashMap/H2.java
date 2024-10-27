package JavaHashMap;

import java.util.ArrayList;//
import java.util.Arrays;//
import java.util.HashMap;//

// Given an array of strings, group the anagrams together. Use a hash map where the key is a sorted version of the string.
public class H2 {//
    public ArrayList<ArrayList<String>> anagramString(String[] str){//
        HashMap<String, ArrayList<String>> map = new HashMap<>();//

        for (int i = 0; i < str.length; i++) {
            char[] ch = str[i].toCharArray();

            char[] sortedChar = bubbleSort(ch);

            String sortedString = Arrays.toString(sortedChar);

            if(!map.containsKey(sortedString)) {
                map.put(sortedString, new ArrayList<>()); // If not, add a new list for this key
            }

            map.get(sortedString).add(str[i]);
        }

        // Return all the grouped anagrams as a list of lists
        return new ArrayList<>(map.values());
    }


    public char[] bubbleSort(char[] data) {
//        char[] sortedChar = new char[]{};
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - 1 - i; j++) {

                if (data[j] > data[ j + 1]) {
                    char temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
        return data;
    }

    public static void main(String[] args) {
        H2 obj = new H2();
        String[] stringArray = {"eat", "tea", "tan","team", "ate", "nat", "bat", "meat"};
        ArrayList<ArrayList<String>> result = obj.anagramString(stringArray);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

    }
}
