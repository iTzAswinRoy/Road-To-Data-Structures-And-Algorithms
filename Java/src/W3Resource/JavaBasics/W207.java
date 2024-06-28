package W3Resource.JavaBasics;
import java.util.Scanner;
// Write a Java program to merge two sorted (ascending) linked lists in ascending order.
public class W207 {
    Node head;
    Node tail;
    int size;
//    int count = 1;
//    int listCount;
    W207(){
        this.size = 0;
//        this.listCount = count++;
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
    public void createLinkedList(){
        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the size of the Linked list "+listCount+":");
        int size = in.nextInt();
//        System.out.println("Enter the values of linked list "+listCount+":");
        for (int i = 0; i < size; i++) {
            insertFirst(in.nextInt());
        }
    }
    public void sortLinkedList(){
        for (Node i = head; i != null ; i = i.next) {
            for (Node j = head; j.next != null ; j = j.next) {
                if(j.value > j.next.value){
                    int temp = j.value;
                    j.value = j.next.value;
                    j.next.value = temp;
                }
            }
        }

    }
    public static W207 mergeLinkedList(W207 list1, W207 list2){
        W207 mergeList = new W207();
        Node curr1 = list1.head;
        Node curr2 = list2.head;
        while (curr1 !=  null && curr2 != null){
            if(curr1.value <= curr2.value){
                mergeList.insertFirst(curr1.value);
                curr1 = curr1.next;
            } else {
                mergeList.insertFirst(curr2.value);
                curr2 = curr2.next;
            }
        }
        return mergeList;
    }
    public void display(){
//        System.out.println("Linked List "+listCount+":");
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
        System.out.println("LL 1");
        obj1.createLinkedList();
        W207 obj2 = new W207();
        System.out.println("LL 2");
        obj2.createLinkedList();
        System.out.println("Display LL 1");
        obj1.display();
        System.out.println("Sorted LL 1");
        obj1.sortLinkedList();
        obj1.display();
        System.out.println();
        System.out.println("Display LL 2");
        obj2.display();
        System.out.println("Sorted LL 2");
        obj2.sortLinkedList();
        obj2.display();
        System.out.println();
        System.out.println("Merge lists:");
        W207 result = W207.mergeLinkedList(obj1, obj2);
        result.display();
    }
}
