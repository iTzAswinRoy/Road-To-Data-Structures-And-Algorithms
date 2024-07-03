package W3Resource.JavaStack;
// Write a Java program to count all stack elements.
public class WS7 {
    int[] arr;
    int top;

    WS7(int size) {
        arr = new int[size];
        top = -1;
    }

    public void push(int num) {
        if (top == arr.length - 1) {
            System.out.println("Stack is full");
        } else {
            top++;
            arr[top] = num;
        }
    }
    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            top--;
        }
    }
    public void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(arr[top]);
        }
    }
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }
    public int countElements(){
        int count = 0;
        if(top == -1){
            return count;
        } else {
            for (int i = top; i >= 0; i--) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        WS7 obj = new WS7(5);
        System.out.println("Given stack:");
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.display();
        System.out.println("Number of elements in the stack is "+ obj.countElements());
    }
}