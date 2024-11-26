package JavaLinkedList;
// Write a Java program that swaps two elements in a linked list.
public class WLL15 {
    // Creating instance variables for the class
    private int size;       // Creating a variable to store size
    private Node head;      // Crating a reference variable 'head' of class Node type
    private Node tail;      // Crating a reference variable 'tail' of class Node type

    WLL15(){        // Creating a default constructor
        this.size = 0;         // Initializing the size to 0
    }
    public class Node {         // Creating a 'Node' class
        // Creating instance variables for the class
        private int value;      // Creating an instance variable to store a value of the node
        private Node next;      // Creating a reference variable, pointing towards the next node

        Node(int value) {        // Creating a parameter constructor by passing the value
            // Initializing values to the instance variable
            this.value = value;
        }
    }

    public void insertNode(int value) {         // Method to insert node in the linked list
        Node newNode = new Node(value);         // Creating a node by passing the value

        // Checking if the tail is null, then the linked list is empty
        if (tail == null) {
            // Updating the head
            newNode.next = head;        // Assigning the new node's next pointer to 'head'
            head = newNode;         // Updating the head as new node
            tail = head;        // Updating the head as tail
        } else {
            tail.next = newNode;        // Assigning the tail's next pointer to new node
            tail = newNode;         // Assigning the tail's next pointer to new node
        }
        size++;         // Incrementing size by 1
    }

    public void swapNodes(int index1, int index2){
        Node prev1 = null;//
        Node curr1 = head;
        for (int i = 0; i < index1; i++) {
            prev1 = curr1;
            curr1 = curr1.next;
        }

        Node prev2 = null;
        Node curr2 = head;
        for (int i = 0; i < index2; i++) {
            prev2 = curr2;
            curr2 = curr2.next;
        }

        if(prev1!=null){
            prev1.next = curr2;
        } else{
            head = curr2;
        }

        if(prev2 != null){
            prev2.next = curr1;
        } else {
            head = curr1;
        }

        Node temp = curr1.next;
        curr1.next = curr2.next;
        curr2.next = temp;
    }

    public void display() {         // Method to display the linked list
        Node temp = head;       // Creating a 'temp' node pointing at head

        while (temp != null) {      // Iterating the linked list till the 'temp' reaches null
            System.out.print(temp.value + " -> ");      // Displaying the current node
            temp = temp.next;       // Moving the pointer to the next node

            // Checking if the 'temp' reaches the end
            if(temp == null) {
                System.out.println("END");      // Displaying 'END' for reference
            }
        }
    }

    public static void main(String[] args) {
        WLL15 linkedList = new WLL15();
        linkedList.insertNode(1);
        linkedList.insertNode(2);
        linkedList.insertNode(3);
        linkedList.insertNode(4);
        linkedList.insertNode(5);
        System.out.println("Given linked list:");
        linkedList.display();
        System.out.println("\nLinked list after swapping:");
        linkedList.swapNodes(0,4);
        linkedList.display();
    }
}
