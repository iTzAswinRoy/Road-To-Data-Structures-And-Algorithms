package JavaStack;
// Write a Java program to implement a stack that checks if a given element is present or not in the stack.
public class WS8 {
    int[] arr;
    int top;

    WS8(int size) {
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
    public boolean checkElement(int element){
        if (top == -1) {
            System.out.println("Stack is empty");
            return false;
        } else{
            for (int i = top; i >= 0; i--) {
                if(arr[i] == element){
                    return true;
                }
            }
        }
        return false;
    }
    public void searchElement(int element) {
        int count = -1;
        if (top == -1) {
            System.out.println("Stack is empty");
        }
        System.out.println("\nChecking if the given element " + element + " is present in the stack..." + checkElement(element));
        if (checkElement(element)) {
            for (int i = top; i >= 0; i--) {
                count++;
                if (arr[i] == element) {
                    System.out.println("Element found in the stack at index " + count);
                }
            }
        } else {
            System.out.println("Element not found in the stack!");
        }
    }
    public static void main(String[] args) {
        WS8 obj = new WS8(5);
        System.out.println("Given stack:");
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(55);
        obj.display();
        obj.searchElement(10);
    }
}
