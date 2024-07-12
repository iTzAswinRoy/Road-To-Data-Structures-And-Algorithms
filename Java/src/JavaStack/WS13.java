package JavaStack;
// Write a Java program to remove a specific element from a stack.
public class WS13 {
    int[] arr;
    int top;
    WS13(int size) {
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
    public boolean checkingElement(int element){
        for (int i = top; i >= 0; i--) {
            if (arr[i] == element) {
                return true;
            }
        }
        return false;
    }
    public void removeElement(int element) {
        if(checkingElement(element)) {
            System.out.println("Stack after removing the element "+element+":");
            for (int i = top; i >= 0; i--) {
                if (arr[i] == element) {
                    top--;
                    continue;
                } else {
                    System.out.print(arr[i]+" ");
                }
            }
        } else {
            System.out.println("Element not found!");
        }
    }
    public static void main(String[] args) {
        WS13 obj = new WS13(5);
        System.out.println("Given stack:");
        obj.push(65);
        obj.push(99);
        obj.push(80);
        obj.push(25);
        obj.push(30);
        obj.display();
        System.out.println();
        obj.removeElement(99);
    }
}
