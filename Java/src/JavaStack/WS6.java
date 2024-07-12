package JavaStack;
// Write a Java program to remove all elements from a stack.
public class WS6 {
    int[] arr;
    int top;
    WS6(int size){
        arr= new int[size];
        top =-1;
    }
    public void push(int num){
        if(top == arr.length-1){
            System.out.println("Stack is full");
        } else{
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
        if(top == -1) {
            System.out.println("Stack is empty");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();

    }
    public void emptyStack(){
        for (int i = top; i >= 0; i--) {
            pop();
        }
        System.out.println("Stack is cleared");
    }
    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        WS6 obj = new WS6(5);
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        System.out.println("given stack:");
        obj.display();
        System.out.println("\nCalling method to clear the stack:\n");
        obj.emptyStack();
        obj.display();

        System.out.println("Does the stack is really empty?\n"+ obj.isEmpty());
    }
}
