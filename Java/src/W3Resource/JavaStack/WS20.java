package W3Resource.JavaStack;
// Write a Java program that implements a stack and checks if two stacks are equal.
public class WS20 {
    int[] arr;
    int top;
    WS20(int size){
        arr = new int[size];
        top = -1;
    }
    public void push(int num){
        if(top == arr.length -1){
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
    static boolean checkStack(WS20 obj1, WS20 obj2) {
        if(obj1.top != obj2.top){
            return false;
        } else {
            for (int i = obj1.top; i >= 0; i--) {
                if (obj1.arr[i] == obj2.arr[i]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        WS20 obj1 = new WS20(5);
        System.out.println("Stack - 1:");
        obj1.push(1);
        obj1.push(2);
        obj1.push(3);
        obj1.push(4);
        obj1.push(5);
        obj1.display();

        System.out.println("Stack - 2:");
        WS20 obj2 = new WS20(5);
        obj2.push(1);
        obj2.push(2);
        obj2.push(3);
        obj2.push(4);
        obj2.push(5);
        obj2.display();
        System.out.println("Checking if the both stack - 1 & 2 are same:\n"+ checkStack(obj1, obj2));
    }
}
