package W3Resource.JavaStack;
// Write a Java program to reverse the elements of a stack.
public class WS4 {
    int[] arr;
    int top;
    WS4(int size){
        arr= new int[size];
        top= -1;
    }
    public void push(int num){
        if(top == arr.length-1){
            System.out.println("stack is full");
        }else {
           top++;
           arr[top] = num;
        }
    }
    public void pop(){
        if(top == -1){
            System.out.println("Stack is empty");
        } else{
            top--;
        }
    }
    public void peek(){
        if(top == -1){
            System.out.println("stack is empty");
        } else {
            System.out.println(arr[top]);
        }
    }
    public void display(){
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
    public void reverse(){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        WS4 obj = new WS4(5);
        System.out.println("Given stack:");
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.display();
        System.out.println("\nReversed stack:");
        obj.reverse();
    }
}
