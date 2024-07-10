package W3Resource.JavaLinkedList;
// Reverse a singly linked list using stack.
public class WLL2 {
    Node head;
    Node tail;
    int size;
    int[] arr;
    int top;
    WLL2(){     // Linked list constructor
        this.size = 0;
    }
    WLL2(int size){     // Stack constructor
        arr = new int[size];
        top = -1;
    }
    public void insertFirst(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        if(tail == null){
            tail = head;
        }
        size++;
    }
    public void display(){
        Node temp = head;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("END");
        }
    }
    public void push(int num){
        if(top == arr.length){
            System.out.println("Stack is full");
        } else {
            top++;
            arr[top] = num;
        }
    }
    public int pop(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top--];
    }
    public void reverseLinkedListUsingStack(){
        WLL2 Stack = new WLL2(size);
        Node temp = head;
        for (int i = 0; i < size; i++) {
            Stack.push(temp.value);
            temp = temp.next;
        }
        temp = head;    // Reassigning the temp pointing to head. Otherwise, temp will be at tail and will show null
        for (int i = 0; i < size; i++) {
            temp.value = Stack.pop();   // Here it's replacing the values with the linked list and stack
            temp = temp.next;
        }
    }
    public class Node{
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }
    public static void main(String[] args) {
        WLL2 linkedList = new WLL2();
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
        linkedList.insertFirst(5);
        System.out.println("Given linked list:");
        linkedList.display();
        System.out.println("\nLinked list after reversing using stack:");
        linkedList.reverseLinkedListUsingStack();
        linkedList.display();
    }
}
