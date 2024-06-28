package W3Resource.JavaBasics;
import java.util.Scanner;
// Write a Java program to merge two sorted (ascending) linked lists in ascending order.
public class W207 {
    Node head;
    Node tail;
    int size;
    int count = 1;
    int listCount;
    W207(){
        this.size = 0;
        this.listCount = count++;
    }
    public void insertFirst(int data){
        Node newNode = new Node(data);
        if(tail == null){
            tail = head;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }
    public void sortLinkedList(Node node){

    }
    public void createLinkedList(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the Linked list "+listCount+":");
        int size = in.nextInt();
        System.out.println("Enter the values of linked list "+listCount+":");
        for (int i = 0; i < size; i++) {
            insertFirst(in.nextInt());
        }
    }
    public void display(){
        System.out.println("Linked List "+listCount+":");
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value+"->");
            temp = temp.next;
            if(temp == tail.next){
                System.out.print("END\n");
            }
        }
    }
    class Node{
        int value;
        Node next;
        Node(int value) {
            this.value = value;

        }
    }
    public static void main(String[] args) {
        W207 obj1 = new W207();
        obj1.createLinkedList();

        W207 obj2 = new W207();
        obj2.createLinkedList();
        obj1.display();
        obj2.display();


    }
}
