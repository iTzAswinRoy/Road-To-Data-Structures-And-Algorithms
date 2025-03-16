package JavaRecursion.String;
// subsequence of the string
public class R2 {
    public static void main(String[] args) {
        R2 obj = new R2();
        obj.subSeq("abc", "");
    }

    public void subSeq(String data, String result) {//
        System.out.println("subSeq called with data: \"" + data + "\", result: \"" + result + "\"");

        if(data.isEmpty()) {
            System.out.println(result);
            return;
        }
        char ch = data.charAt(0);

        subSeq(data.substring(1), result + ch);
        subSeq(data.substring(1), result);
    }
}