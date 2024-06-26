package W3Resource.JavaBasics;
import java.util.Scanner;
import java.lang.StringBuilder;
import java.lang.String;
import java.util.Arrays;
// Write a Java program to create a basic string compression method using repeated character counts.
public class W208 {
    public static void main(String[] args) {
        W208 obj = new W208();
        System.out.println("Enter the text: ");
        String text = obj.userInputs();
        text = obj.sort(text);
        obj.display(text);
        obj.characterCounter(text);
    }
    public String userInputs(){
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
    public String sort(String text){
        char[] charArray = text.toCharArray();
        for (int i = 0; i < text.length() - 1; i++) {
            for (int j = 0; j < text.length() - i - 1; j++) {
                if(charArray[j] > charArray[j+1]) {
                    char temp = charArray[j];
                    charArray[j] = charArray[j+1];
                    charArray[j+1] = temp;
                }
            }
        }
        return String.valueOf(charArray);
    }
    public void characterCounter(String data){
        StringBuilder temp = new StringBuilder();
        int count = 1;
        for (int i = 0; i < data.length(); i++) {
            if (i + 1 < data.length() && data.charAt(i) == data.charAt(i+1) ) {
                count++;
            } else {
                temp.append(data.charAt(i));
                if(count > 1){
                    temp.append(count);
                }
                count = 1;
            }
        }
        String result = temp.toString();
        System.out.println("Result\n"+result);
    }
    public void display(String data){
        System.out.println(data);
    }
}
