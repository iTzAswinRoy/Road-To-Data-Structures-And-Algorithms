package JavaxIQ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RearrangeStringBasedNumbers {
    public static void main(String[] args) {
        String str = "it2's Aswi3n Hi1";

        System.out.println("Given list: \n"+ str);

        char[] ch = str.toCharArray();

        List<String> strList = new ArrayList<>();
        List<Integer> numList = new ArrayList<>();

        Map<Integer, String> resultMap = new HashMap<>();

        String result = "";

        for (int i = 0; i < ch.length; i++) {

            if (i == ch.length - 1) {
                strList.add(result);
            }

            if (Character.isDigit(ch[i])) {
                numList.add(Character.getNumericValue(ch[i]));

            } else if(ch[i] == ' ') {
                strList.add(result);
                result ="";

            } else {
                result += ch[i];
            }
        }

        for (int i = 0; i < strList.size(); i++) {
            resultMap.put(numList.get(i), strList.get(i));
        }

        System.out.println("\nResult:\n" + resultMap.values());
    }
}