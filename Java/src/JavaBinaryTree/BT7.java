package JavaBinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// Find the average value of nodes in each level
public class BT7 {
    private Node root;

    class Node{
        int data;
        Node left;
        Node right;

        Node(int value) {
            this.data = value;
        }
    }

    public void insert(int value){
        root = insert(root, value);
    }

    private Node insert(Node root, int value){
        if(root == null){
            root = new Node(value);
            return root;
        }
        if(value<root.data){
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public void display(){
        display(root);
    }

    private void display(Node root){
        String str = "";
        if(root.left != null){
            str += root.left.data ;
        } else {
            str += "no left";
        }
        str += " <- | " +root.data + " | -> ";

        if(root.right != null){
            str += root.right.data;
        } else {
            str += " no right";
        }
        System.out.println(str);

        if(root.left != null) {
            display(root.left);
        }

        if(root.right != null){
            display(root.right);
        }
    }

    public ArrayList<Integer> averageLevel(){
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> array = new ArrayList<>();

        queue.add(this.root);

        while (!queue.isEmpty()){
            int sum =0;
            int size = queue.size();

            for (int i = 0; i < size; i++) {

                Node currentNode = queue.poll();
                sum += currentNode.data;

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            array.add(sum / size);
        }
        return array;
    }

    public static void main(String[] args) {
        BT7 obj = new BT7();

        obj.insert(5);
        obj.insert(2);
        obj.insert(4);
        obj.insert(7);
        obj.insert(1);
        obj.insert(8);
        obj.insert(6);

        obj.display(obj.root);

        System.out.println();

        System.out.println(obj.averageLevel());
    }
}
