package W3Resource.JavaStack;
//  Write a Java program to find the maximum and minimum elements in a stack.
public class WS5 {
    int[] arr;
    int top;
    WS5(int size) {
        arr= new int[size];
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
    public void pop(){
        if(top == -1){
            System.out.println("Stack is empty");
        } else {
            top--;
        }
    }
    public void peek(){
        if(top == -1){
            System.out.println("Stack is empty");
        } else {
            System.out.println(arr[top]);
        }
    }
    public void display(){
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
    public void maxAndMin(){
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        for (int i = top; i >= 0; i--) {
            if(arr[i] > min){
                min = arr[i];
            }
            if(arr[i] < max){
                max = arr[i];
            }
        }
        System.out.println("The maximum element in the stack: "+ max);
        System.out.println("The minimum element in the stack: "+ min);
    }
    public static void main(String[] args) {
        WS5 obj = new WS5(5);
        System.out.println("Given stack:");
        obj.push(15);
        obj.push(20);
        obj.push(99);
        obj.push(35);
        obj.push(50);
        obj.display();
        System.out.println();
        obj.maxAndMin();
    }
}
