package W3Resource.JavaLinkedList;

import java.util.Scanner;

// Reverse a singly linked list using stack.
public class GT1 {
    Node head;
    Node tail;

    int size;
    int[] arr;
    int top;
    GT1(int size) {
        arr = new int[size];
        top = -1;
    }
    GT1() {
        this.size = 0;
    }
    public class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
    public void push(int value) {
        if (top == arr.length) {
                System.out.println("Stack is full");
            } else {
                top++;
                arr[top] = value;
            }
        }

        public int pop() {
            if (top == -1) {
                System.out.println("Stack is empty!");
                return -1;
            } else {
                return arr[top--];
            }
        }
        public void insertFirst(int value) {
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
            if (tail == null) {
                tail = head;
            }
            size++;
        }
        public GT1 userInputs() {
            GT1 newLinkedList = new GT1();
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the size of the linked list:");
            int size = in.nextInt();
            System.out.println("Enter the values of the linked list:");
            for (int i = 0; i < size; i++) {
                newLinkedList.insertFirst(in.nextInt());
            }
            return newLinkedList;
        }
        public void printLL() {
            Node temp = head;
            for (int i = 0; i < size; i++) {
                System.out.print(temp.value + "->");
                temp = temp.next;
            }
            System.out.println("END");

        }
        public void reverseLL() {
            GT1 stack = new GT1(size);
            Node temp = head;
            while (temp != null) {
                stack.push(temp.value);
                temp = temp.next;
            }
            temp = head;
            while (temp != null) {
                temp.value = stack.pop();
                temp = temp.next;
            }
        }
        public static void main(String[] args) {
            GT1 obj = new GT1();
            GT1 LinkedList = obj.userInputs();

            System.out.println("Given linked list:");
            LinkedList.printLL();
            System.out.println("\nReversing the linked list.");
            LinkedList.reverseLL();
            LinkedList.printLL();
        }
}
