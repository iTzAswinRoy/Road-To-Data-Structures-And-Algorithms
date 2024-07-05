package W3Resource.JavaStack;
// Write a Java program that implements a stack and creates a new stack from a portion of the original stack.
public class WS24 {
    int[] arr;
    int top;
    WS24(int size){
        arr = new int[size];
        top = -1;
    }
    public void push(int num){
        if(top == arr.length - 1){
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
    public void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(arr[top]);
        }
    }
    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }
    public void display(){
        if( top == -1 ){
            System.out.println("Stack is empty");
        } else {
            for (int i = top; i >= 0 ; i--) {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println("\n");
    }
    public void potionOfTheStack(int i1, int i2) {
        if (isEmpty()){
            System.out.println("stack is empty");
            return;
        }
        if(i1 < 0 || i2 < 0 || i1 > top ||  i2 > top){
            System.out.println("Index out of bound!");
            return;
        }
        if(i1 > i2 ) {
            for (int i = i1; i >= i2; i--) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("Index error! index 1 should be greater than index 2");
        }
    }
    public static void main(String[] args) {
        WS24 obj = new WS24(5);
        System.out.println("Original stack :");
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.display();
        System.out.println("Extracting a portion from the stack:");
        obj.potionOfTheStack(5, 2);
    }
}
