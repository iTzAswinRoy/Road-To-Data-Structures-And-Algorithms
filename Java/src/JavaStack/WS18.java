package JavaStack;
// Write a Java program to merge two stacks into one.
public class WS18 {//
    int[] arr;//
    int top;//
    WS18(int size){//
        arr = new int[size];//
        top = -1;//
    }
    public void push(int num) {//
        if(top == arr.length-1) {//
            System.out.println("stack is full");
        } else {
            top++;//
            arr[top] = num;//
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
        if (top == -1){
            System.out.println("Stack is empty");
        } else {
            System.out.println(arr[top]);
        }
    }
    public boolean isEmpty(){
        if (top == -1){
            return  true;
        }
        return false;
    }
    public void display(){
        if (top == -1) {
            System.out.println("Stack is empty");
        }else {
            for (int i = top; i >=0 ; i--) {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println("\n");
    }
    static void mergeStack(WS18 obj1, WS18 obj2) {
        int newSize = obj1.arr.length + obj2.arr.length;
        WS18 newStack = new WS18(newSize);
        for (int i = obj1.arr.length-1; i >= 0; i--) {
            newStack.push(obj1.arr[i]);
        }
        for (int j = obj2.arr.length-1; j >= 0; j--) {
            newStack.push(obj2.arr[j]);
        }
        newStack.display();
    }
    public static void main(String[] args) {    // Main method
        WS18 obj1 = new WS18(5);    // Creating a class object
        System.out.println("Stack - 1");
        obj1.push(1);
        obj1.push(2);
        obj1.push(3);
        obj1.push(4);
        obj1.push(5);
        obj1.display();     // displaying

        WS18 obj2 = new WS18(5);
        System.out.println("Stack - 1");
        obj2.push(6);
        obj2.push(7);
        obj2.push(8);
        obj2.push(9);
        obj2.push(10);
        obj2.display();

        System.out.println("Merging those two stacks into one");
        mergeStack(obj1, obj2);

    }
}
