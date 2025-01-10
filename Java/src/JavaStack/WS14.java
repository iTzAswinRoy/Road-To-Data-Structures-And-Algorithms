package JavaStack;
// Write a Java program to swap the top two elements of a given stack.
public class WS14 {
    int[] arr;//
    int top;//
    WS14(int size) {//
        arr = new int[size];//
        top = -1;//
    }
    public void push(int num) {//
        if (top == arr.length - 1) {//
            System.out.println("Stack is full");
        } else {
            top++;//
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
    public void swapElements(int e1, int e2){
        int index1 = 0;
        int index2 = 0;
        System.out.println("\nThe elements to be swapped are "+e1+" & "+e2+"\n");
        for (int i = top; i >= 0; i--) {
            if(arr[i] == e1){
                index1 = i ;
            }
            if(arr[i] == e2){
                index2 = i;
            }
        }
        if (index1 == 0 || index2 ==0){
            System.out.println("Can't perform the swap function because the element which is given is not found!");
            return;
        }
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        System.out.println("Stack after being swapped:");
        display();
    }
    public static void main(String[] args) {
        WS14 obj = new WS14(5);
        System.out.println("Given stack:");
        obj.push(65);
        obj.push(99);
        obj.push(80);
        obj.push(25);
        obj.push(30);
        obj.display();
        obj.swapElements(25,80);
    }
}
