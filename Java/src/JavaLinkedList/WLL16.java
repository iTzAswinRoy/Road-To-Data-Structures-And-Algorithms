package JavaLinkedList;
import java.util.ArrayList;
import java.util.Random;
// Write a Java program to shuffle elements in a linked list.
public class WLL16 {
    Node head;//
    Node tail;//
    int size;//
    WLL16(){
        this.size = 0;
    }
    public void insertNode(int value){
        Node newNode = new Node(value);
        if(tail == null){
            newNode.next = head;
            head = newNode;
            tail = head;
        }else {
            tail.next = newNode;
            tail = newNode;
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
    public ArrayList<Integer> convertToArrayList(){
        ArrayList<Integer> arrList = new ArrayList<>();
        Node temp = head;
        for (int i = 0; i < size; i++) {
            arrList.add(temp.value);
            temp = temp.next;
        }
        return arrList;
    }
    public void shuffleElements(ArrayList<Integer> arrayList) {
        Random random = new Random();

        for (int i = 0; i < arrayList.size() ; i++) {
            int randomInt = random.nextInt(i + 1);      // This provides random number between 0 and 'i'.

            int temp = arrayList.get(i);
            arrayList.set(i, arrayList.get(randomInt));
            arrayList.set(randomInt, temp);
        }
        Node temp = head;
        for (int i = 0; i < arrayList.size(); i++) {
            temp.value = arrayList.get(i);
            temp = temp.next;
        }
    }
    public class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    public static void main(String[] args) {
        WLL16 linkedList = new WLL16();
        linkedList.insertNode(10);
        linkedList.insertNode(20);
        linkedList.insertNode(30);
        linkedList.insertNode(40);
        linkedList.insertNode(50);
        System.out.println("Given linked list:");
        linkedList.display();

        ArrayList<Integer> arrayList = linkedList.convertToArrayList();
        System.out.println("\nConverting linked list to array list:\n"+arrayList);

        System.out.println("\nShuffling the linked list:");
        linkedList.shuffleElements(arrayList);
        linkedList.display();
    }
}