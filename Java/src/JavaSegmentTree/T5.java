package JavaSegmentTree;

import java.util.Arrays;

// Build a segment tree that supports:
// Update: Change the value of a particular index.
//        Query: Count how many even and odd numbers exist in a given range [L, R].
// Input: arr[] = {1, 2, 3, 4, 5, 6}
// Queries:
//        - Count even and odd numbers from index 1 to 4.
//        - Update index 3 to 10.
//        - Count even and odd numbers from index 1 to 4.
public class T5 {
    Node root;

    class Node {
        int data;
        Node left;
        Node right;
        int startIndex;
        int endIndex;

        Node(int startIndex, int endIndex) {
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }
    }

    public void segmentTree(int[] arr) {
        root = segmentTree(arr, 0, arr.length-1);
    }

    public Node segmentTree(int[] arr, int start, int end) {
        if(start == end) {
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
        }

        int mid = (start+end)/2;
        Node newNode = new Node(start, end);

        newNode.left = segmentTree(arr, start, mid);
        newNode.right = segmentTree(arr, mid+1, end);

        return newNode;
    }

    public int queryCount(int startIndex, int endIndex){
        queryCount(root, startIndex, endIndex);
    }

    public int queryCount(Node root, int start, int end){
        if(root.startIndex < start || root.endIndex > end){
            return 0;
        }

        if(root.startIndex <= end && root.endIndex >= start){

            int left = queryCount(root.left, start, end);
            int right = update(root.right, start, end);


        }
    }

    public boolean check(int value){

    }

    public void update(int index, int value){
        update(root, index, value);
    }

    private int update(Node root, int index, int value) {
        if(index < root.startIndex || index > root.endIndex) {
            return root.data;
        }

        if(index == root.startIndex  && index == root.endIndex){
            root.data = value;
            return root.data;
        }

        int left = update(root.left, index, value);
        int right = update(root.right, index, value);

        return root.data;
    }

    public void display(Node root){
        if(root == null){
            return;
        }
        display(root.left);
        display(root.right);
        System.out.print(root.data+ " ");
    }

    public static void main(String[] args) {
        T5 obj = new T5();

        int[] arr = {1, 3, 2, 7, 9, 11};
        System.out.println(Arrays.toString(arr));

        obj.segmentTree(arr);
        obj.display(obj.root);

        System.out.println();
        obj.queryCount(0,2);

        obj.update(2,6);
        obj.display(obj.root);

        System.out.println();
        obj.queryCount(0,2);
    }
}
