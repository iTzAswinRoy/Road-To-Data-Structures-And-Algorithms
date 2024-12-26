package JavaQueue;

import java.util.Scanner;       // Importing scanner class

public class Q1 {
    private int[] queue;        // Array to store elements in the queue
    private int size;           // Current size of the queue
    private int front;          // Front pointer
    private int end;            // End pointer
    private int capacity;       // Maximum capacity of the queue

    Q1 (int capacity) {          // Constructor to initialize the queue
        this.queue = new int[capacity];
        this.capacity = capacity;
        this.size = 0;
        this.front = 0;
        this.end = 0;
    }

    public void enqueue(int value) {        // Method to add elements to the queue
        if (size == capacity) {
            System.out.println("Queue is full. Cannot enqueue " + value);
            return;//
        }
        System.out.println("enter the elements");//

        queue[end] = value;//
        end = (end + 1) % capacity;         // Wrap around end pointer
        size++;//
    }

    public int deQueue() {                  // Method to remove elements from the queue
        if (size == 0) {//
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        System.out.println("Removing the element");
        int value = queue[front];
        front = (front + 1) % capacity;     // Wrap around front pointer
        size--;
        return value;
    }

    public int peek() {                     // Method to view the first element in the queue
        if (size == 0) {
            System.out.println("Queue is empty. Nothing to peek.");
            return -1;
        }
        System.out.println("peeking the element in the queue.");
        return queue[front];
    }

    @Override
    public String toString() {              // Method to display the queue as a string
        String result = "Queue: ";
        int current = front;
        for (int i = 0; i < size; i++) {
            result += queue[current] + " ";
            current = (current + 1) % capacity;
        }
        return result.trim();
    }

    public static void main(String[] args) { // Main method for command-line interaction
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the capacity of the queue:");
        int capacity = in.nextInt();

        Q1 queue = new Q1(capacity);

        System.out.println("\nQueue initialized successfully.");

        System.out.println("\n1. Add a value to the queue (enqueue)");
        System.out.println("2. Remove the front element from the queue (dequeue)");
        System.out.println("3. View the front element of the queue (peek)");
        System.out.println("4. Exit");


        boolean execution = true;

        while (execution) {
            System.out.print("\nEnter an option:");
            int option = in.nextInt();
            in.nextLine();

            switch (option) {
                case 1 -> {
                    int value = in.nextInt();
                    queue.enqueue(value);
                }

                case 2 -> queue.deQueue();

                case 3 -> queue.peek();

                case 4 -> {
                    System.out.println("Exiting.....");
                    execution = false;
                    break;
                }
                default -> System.out.println("Invalid option!");
            }

        }

    }
}
