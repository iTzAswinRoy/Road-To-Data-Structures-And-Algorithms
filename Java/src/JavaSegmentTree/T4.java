package JavaSegmentTree;

import java.util.Arrays;

// Build a segment tree to handle:
// Update: Modify the value of an element in the array.
// Query: Find the sum of squares of elements in a given range [L, R].
// Example:
// Input: arr[] = {1, 2, 3, 4}
// Queries:
//        - Query sum of squares from index 0 to 2.
//        - Update index 1 to 5.
//        - Query sum of squares from index 0 to 2.
public class T4 {//
    Node root;

    class Node{//
        int data;
        Node left;//
        Node right;//
        int startIndex;//
        int endIndex;

        Node(int startIndex, int endIndex){
            this.startIndex =startIndex;
            this.endIndex = endIndex;
        }
    }
    public void segmentTree(int[] arr){
        root = segmentTree(arr, 0, arr.length-1);
    }

    private Node segmentTree(int[] arr, int start, int end){
        if(start == end){
            Node leaf = new Node(start, end);
            leaf.data = arr[start]*arr[start];
            return leaf;
        }
        int mid = (start + end)/2;
        Node newNode = new Node(start, end);

        newNode.left = segmentTree(arr, start, mid);
        newNode.right = segmentTree(arr, mid+1, end);

        newNode.data = newNode.left.data+ newNode.right.data;
        return newNode;
    }

    public void querySqrt(int start, int end){
        System.out.println("Query: \n"+querySqrt(root, start, end));
    }

    private int querySqrt(Node root, int start, int end){
        if(root.startIndex> end || root.endIndex<end){
            return 0;
        }

        if(root.startIndex >= start && root.endIndex <= end){
            return root.data;
        }

        int left = querySqrt(root.left, start, end);
        int right = querySqrt(root.right, start, end);

        root.data = left+right;

        return root.data;
    }

    public void update(int index, int value){
        update(root, index, value);
    }

    private int update(Node root, int index, int value){
        if(index < root.startIndex || index > root.endIndex){
            return root.data;
        }

        if(index == root.startIndex && index == root.endIndex){
            root.data = value*value;
            return root.data;
        }

        int left = update(root.left, index, value);
        int right = update(root.right, index, value);

        root.data = left+right;

        return root.data;
    }

    public void display(Node root){
        if(root == null){
            return;
        }
        display(root.left);
        display(root.right);
        System.out.print(root.data+", ");
    }

    public static void main(String[] args) {
        T4 obj = new T4();

        int[] arr = {1, 3, 2, 7, 9, 11};
        System.out.println(Arrays.toString(arr));

        obj.segmentTree(arr);
        obj.display(obj.root);

        System.out.println();
        obj.querySqrt(0,2);

        obj.update(2,6);
        obj.display(obj.root);

        System.out.println();
        obj.querySqrt(0,2);
    }
}
