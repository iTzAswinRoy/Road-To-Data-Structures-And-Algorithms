package JavaStack;
// Write a Java program to implement a stack with push and pop operations.
// Find the top element of the stack and check if the stack is empty or not.
 public class w1 {   // Stack class
    private int[] arr;//
    private int top;//
    w1(int size) {//
        arr = new int[size];
        top = -1;//
    }
    public void push(int num){//
        if(top == arr.length-1){//
            System.out.println("Stack is full");
        } else {
            top++;
            arr[top] = num;
        }
    }
    public int pop() {
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        } else {
            int popElement = arr[top];
            top--;
            return popElement;
        }
    }
    public void peek(){
        if (top == -1){
            System.out.println("stack is empty");
//            return -1;
        } else {
            System.out.println(arr[top]);
        }
    }
    public void display(){
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        w1 obj = new w1(5);
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.display();

        obj.pop();
        System.out.println();
        obj.display();

        obj.pop();
        System.out.println();
        obj.display();

        System.out.println();
        obj.peek();
        obj.peek();

    }
}

