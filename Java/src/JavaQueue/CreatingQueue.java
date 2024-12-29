package JavaQueue;

import JavaCircularLinkedList.FindingLength;

import java.util.ArrayList;
import java.util.Scanner;       // Importing scanner class

public class CreatingQueue {
    private Node head;      // Crating a reference variable 'head' of class Node type
    private Node tail;      // Crating a reference variable 'tail' of class Node type

    class Node {
        private int value;
        private Node next;

        Node (int value) {
            this.value = value;
        }
    }

    public void enqueue(int value) {        // Method to add elements to the queue
        Node newNode = new Node(value);

       if (tail == null) {
          head = newNode;
          tail = head;
       } else {
           newNode.next = head;
           head = newNode;
       }
        System.out.println("Element added.");
    }

    public void deQueue() {       // Method to remove elements from the queue
        if (tail == null) {
            System.out.println("Queue is empty!");
        } else {
            head = head.next;
        }
        System.out.println("Element removed:");
    }

    public void peek() {        // Method to view the first element in the queue
        if (tail == null) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println(head.value);
        }
    }

    public void view() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;

            if (temp == null) {
                System.out.println("Null");
            }
        }
    }

    public static void main(String[] args) { // Main method for command-line interaction
        CreatingQueue queue = new CreatingQueue();
        Scanner in = new Scanner(System.in);

        System.out.println("Queue initialized successfully.");

        boolean execution = true;

        while (execution) {
            System.out.println("\n1. Add a value to the queue (enqueue)");
            System.out.println("2. Remove the front element from the queue (dequeue)");
            System.out.println("3. Peek the first element in the queue:");
            System.out.println("4. View all the elements in the queue:");

            System.out.println("5. Exit");

            System.out.print("\nEnter an option:\n");
            int option = in.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.println("Enter the element to add at first:");

                    int value = in.nextInt();
                    queue.enqueue(value);
                }
                case 2 -> queue.deQueue();

                case 3 -> queue.peek();

                case 4 -> queue.view();

                case 5 -> {
                    System.out.println("Exiting.....");
                    execution = false;
                }
                default -> System.out.println("Invalid option!");
            }
        }
    }
}