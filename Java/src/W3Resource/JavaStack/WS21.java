package W3Resource.JavaStack;
// Write a Java program that implements a stack and finds common elements between two stacks.
public class WS21 {
    int[] arr;
    int top;
    WS21(int size){
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
    public void peek(){
        if( top == -1 ){
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
    static void commonElement(WS21 obj1, WS21 obj2) {
        WS21 newStack = new WS21(Math.min(obj1.arr.length, obj2.arr.length));
        for (int i = obj1.top; i >= 0; i--) {
            for (int j = obj2.top; j >= 0; j--) {
                if (obj1.arr[i] == obj2.arr[j]) {
                    newStack.push(obj1.arr[i]);
                }
            }
        }
        newStack.display();
    }
    public static void main(String[] args) {
        WS21 obj1 = new WS21(5);
        System.out.println("Stack - 1:");
        obj1.push(1);
        obj1.push(2);
        obj1.push(3);
        obj1.push(4);
        obj1.push(5);
        obj1.display();

        System.out.println("Stack - 2:");
        WS21 obj2 = new WS21(5);
        obj2.push(2);
        obj2.push(4);
        obj2.push(3);
        obj2.push(1);
        obj2.push(4);

        obj2.display();

        System.out.println("Common elements from both the stacks are... ");
        commonElement(obj1, obj2);
    }
}
