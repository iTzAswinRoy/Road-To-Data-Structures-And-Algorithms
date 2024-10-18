package JavaSegmentTree;

import java.util.Arrays;

// Problem: Build a segment tree that supports:
// Update: Change the value of a particular index in the array.
// Query: Find the maximum value in a given range [L, R].
// Input: arr[] = {5, 3, 8, 6, 7, 2, 9}
// Queries:
//        - Query max from index 2 to 5.
//        - Update index 3 to 10.
//        - Query max from index 2 to 5.
public class T3 {
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
        root = segmentTree(arr, 0, arr.length - 1);
    }

    private Node segmentTree(int[] arr, int start, int end) {
        if (start == end) {
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }

        int mid = (start + end) / 2;

        Node newNode = new Node(start, end);

        newNode.left = segmentTree(arr, start, mid);
        newNode.right = segmentTree(arr, mid + 1, end);

        newNode.data = Math.max(newNode.left.data, newNode.right.data);
        return newNode;
    }

    public void queryMax(int startIndex, int endIndex){
        System.out.println("\nQuery:\n"+queryMax(root, startIndex, endIndex));
    }

    private int queryMax(Node root, int start,int end){
        if(root.startIndex > end || root.endIndex < start){
            return Integer.MIN_VALUE;
        }

        if(root.startIndex >= start && root.endIndex <= end){

            return root.data;
        }

        int left = queryMax(root.left, start, end);
        int right = queryMax(root.right, start, end);

        int max = Math.max(left, right);
        return max;
    }

    public void update(int index, int value) {
        update(root, index, value);
    }

    private int update(Node root, int index, int value) {
        if (index < root.startIndex || index > root.endIndex) {
            return root.data;
        }
        if (index == root.startIndex && index == root.endIndex) {
            root.data = value;
            return root.data;
        }

        int left = update(root.left, index, value);
        int right = update(root.right, index, value);

        root.data = Math.max(left,right);

        return root.data;
    }

    public void display(Node root){
        if(root == null){
            return;
        }
        display(root.left);
        display(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {
        T3 obj = new T3();

        int[] arr = {5, 3, 8, 6, 7, 2, 9};
        System.out.println("Given array:\n"+ Arrays.toString(arr));

        System.out.println("\nGenerating segment tree:");
        obj.segmentTree(arr);
        obj.display(obj.root);

        System.out.println();
        obj.queryMax(3,5);

        System.out.println("\nGenerating segment tree:");
        obj.update(3, 10);
        obj.display(obj.root);

        System.out.println();
        obj.queryMax(2,5);
    }
}