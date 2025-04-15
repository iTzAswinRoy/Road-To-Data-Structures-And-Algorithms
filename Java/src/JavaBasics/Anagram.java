package JavaBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// Two strings s and p, find all starting indices of p's anagrams in s.
// You can return the indices in any order.

public class Anagram {

    public List<Integer> findAnagram(String s, String p){
        List<Integer> result = new ArrayList<>();

        char[] pChar = p.toCharArray();
        Arrays.sort(pChar);

        String sortedP = new String(pChar);

        for (int i = 0; i <= s.length() - p.length(); i++) {
            String subString = s.substring(i, i + p.length());

            char[] sChar = subString.toCharArray();

            Arrays.sort(sChar);

            String sortedS = new String(sChar);

            if(sortedS.equals(sortedP)){
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Anagram obj = new Anagram();
        System.out.println(obj.findAnagram("cbacbabacd", "abab"));
        System.out.println(obj.findAnagram("abab", "ab"));

    }
}
