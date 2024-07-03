package W3Resource.JavaStack;
//Write a Java program to sort the elements of a given stack in ascending order
public class WS2 {
    int[] arr;
    int top;
    WS2(int size){
        arr = new int[size];
        top = -1;
    }
    public void push(int num){
        if(top == arr.length-1){
            System.out.println("Stack is full");
        } else {
            top++;
            arr[top] = num;
        }
    }
    public void pop() {
        if(top == -1){
            System.out.println("Stack is empty");
        } else {
            top--;
        }
    }
    public int peek(){
        if(top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return arr[top];
        }
    }
    public void display(){
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
    public void sortAscendingOrder(){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        WS2 obj = new WS2(5);
        obj.push(85);
        obj.push(54);
        obj.push(65);
        obj.push(99);
        obj.push(20);
        System.out.println("Given stack:");
        obj.display();
        System.out.println("\nSorted the stack in ascending order:");
        obj.sortAscendingOrder();
        obj.display();

    }
}
