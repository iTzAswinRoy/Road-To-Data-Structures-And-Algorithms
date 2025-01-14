package JavaSegmentTree;

// Build a segment tree to handle sum queries. Given an array, build a segment tree to efficiently perform:
// Update: Modify the value of an element in the array.
//        Query: Find the sum of elements in a given range [L, R].
// Example:
// Input: arr[] = {1, 3, 5, 7, 9, 11}
// Queries:
//        - Query sum from index 1 to 3.
//        - Update index 1 to 10.
//        - Query sum from index 1 to 3.
public class T1 {

    Node root;

    class Node {//

        int data;
        Node left;
        Node right;
        int startIndex;
        int endIndex;

        Node (int startIndex, int endIndex){
            this.startIndex =startIndex;
            this.endIndex = endIndex;
        }
    }

    public void segmentTree(int[] arr) {
        this.root = constructTree(arr, 0, arr.length-1);
    }

    public Node constructTree(int[] arr, int start, int end) {
        if (start == end) {
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }

        int mid = (start + end) / 2;
        Node root = new Node(start, end);

        root.left = constructTree(arr, start, mid);
        root.right = constructTree(arr, mid+1, end);

        root.data = root.left.data + root.right.data;

        return root;
    }

    public int querySum(int startIndex, int endIndex){
        return querySum(this.root, startIndex, endIndex);
    }

    private int querySum(Node root, int start, int end){
        if(root == null){
            return 0;
        }
        if(root.startIndex >= start && root.endIndex <= end) {      // Checking if the node is inside e query range
             return root.data;

        } else if (root.startIndex > end || root.endIndex < start) {    // Checking if the node is outside e query range
             // completely outside
             return 0;
        }
        //Node is partially inside the query range, so split the query
        int left = querySum(root.left, start, end);
        int right =  querySum(root.right, start, end);

        return left + right;
    }

    public void updateTree(int index, int value){
         update(root, index, value);

    }

    private int update(Node root, int index, int value){
        if(index < root.startIndex || index > root.endIndex) {
            return root.data;
        }

        if(index == root.startIndex && index == root.endIndex){
            root.data = value;
            return root.data;

        }

        int left = update(root.left, index, value);
        int right = update(root.right, index, value);

        root.data = left + right;
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
        int[] arr = {1,2,3,4};

        T1 obj = new T1();

        obj.segmentTree(arr);

        obj.display(obj.root);
        System.out.println();
        System.out.println(obj.querySum(1,3));

        obj.updateTree(0,2);
        obj.display(obj.root);
    }
}
