package JavaRecursion.String;

// Skip a character
public class R1 {//
    public static void main(String[] args) {
        R1 obj = new R1();//
        String temp = "baccad";//

        System.out.println(obj.skipChar(temp));//
    }

    public String skipChar(String sen) {
        if (sen.isEmpty()) {//
            return "";//
        }
        char currentChar = sen.charAt(0);//

        if (sen.charAt(0) == 'a') {
            return skipChar(sen.substring(1));
        }

        return currentChar + skipChar(sen.substring(1));
    }
}