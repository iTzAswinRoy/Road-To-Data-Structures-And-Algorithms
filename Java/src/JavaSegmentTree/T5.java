package JavaSegmentTree;

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

    }
}
