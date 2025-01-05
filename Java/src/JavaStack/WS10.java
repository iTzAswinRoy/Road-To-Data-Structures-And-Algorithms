package JavaStack;
// Write a Java program to find the top and bottom elements of a given stack.

public class WS10 {//
    int[] arr;//
    int top;//
    WS10(int size) {//
        arr = new int[size];//
        top = -1;//
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
    public void topAndBottom() {
        System.out.println("\nThe top-most element of the stack is "+arr[top]);
        System.out.println("\nThe bottom element of the stack is "+arr[0]);
    }
    public static void main(String[] args) {
        WS10 obj = new WS10(5);
        System.out.println("Given stack:");
        obj.push(62);
        obj.push(99);
        obj.push(87);
        obj.push(45);
        obj.push(19);
        obj.display();
        obj.topAndBottom();
    }
}
