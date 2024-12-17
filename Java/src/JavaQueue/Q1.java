package JavaQueue;

// Write a program to implement a queue using arrays with basic operations like enqueue, dequeue, and peek.
public class Q1 {
    // Creating instance variables for the class
    int[] queue;
    int size;           // Creating a variable to store size
    int front;//
    int end;//
    int capacity;//

    Q1 (int capacity) {         // Creating a parameterized constructor
        this.queue = new int[capacity];//
        this.capacity = capacity;//
        this.size = 0;//
        this.front = 0;
        this.end = 0;//
    }

    public void enqueue(int value) {        // Method to insert elements in the queue
        queue[end] = value;//
        end = (end + 1) % capacity; // Wrap around end pointer
        size++;
    }

    public int deQueue(){           // Method to remove elements in the queue
        int value = queue[front];
        front = (front + 1) % capacity;
        size--;
        return value;
    }

    public int peek() {          // Method to peek the first element in the queue
        return queue[front];
    }
    @Override
    public String toString(){
        String result = "";

        int current = front;
        for (int i = 0; i < size; i++) {
            result += queue[current] + " ";
            current = (current + 1) % capacity;
        }
        return result;
    }

    public static void main(String[] args) {         // Main method
        Q1 queue = new Q1(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println("Queue after inserting elements:\n"+queue);
        System.out.println("\nDequeue element from the queue:\n"+queue.deQueue());

        System.out.println("\nUpdated queue:\n"+queue);
        System.out.println("\nPeeking elements from the queue:\n"+queue.peek());
    }
}
