package JavaStack;
// Write a Java program that implements a stack and checks if all elements of the stack satisfy a condition.
public class WS26 {
    int[] arr;
    int top;
    WS26(int size){
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
    public boolean checkEven(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        } else {
            for (int i = top; i >= 0; i--) {
                if (arr[i] % 2 != 0) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        WS26 obj = new WS26(5);
        System.out.println("Original stack :");
        obj.push(2);
        obj.push(4);
        obj.push(6);
        obj.push(8);
        obj.push(10);
        obj.display();
        System.out.println("Checking if all the elements in the stack are even: "+obj.checkEven());

    }
}
