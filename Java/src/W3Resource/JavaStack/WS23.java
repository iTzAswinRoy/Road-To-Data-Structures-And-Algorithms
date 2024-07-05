package W3Resource.JavaStack;
// Write a Java program that implements a stack and creates a new stack that contains all elements from two stacks without duplicates.
public class WS23 {
    int[] arr;
    int top;
    WS23(int size){
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
    static WS23 mergeStack(WS23 obj1, WS23 obj2) {
        WS23 newStack = new WS23(obj1.arr.length + obj2.arr.length);
        for (int i = obj1.top; i >= 0; i--) {
            newStack.push(obj1.arr[i]);
        }
        for (int j = obj2.top; j >= 0; j--) {
            newStack.push(obj1.arr[j]);
        }
        return newStack;
    }
    static void duplicateElements(WS23 mergeStack) {
        WS23 newStack = new WS23(mergeStack.arr.length);
        for (int i = mergeStack.top; i >= 0; i--) {
            for (int j = mergeStack.top; j >= 0; j--) {
                if(mergeStack.arr[i] == mergeStack.arr[j]) {
                    boolean existingElement = false;
                    for (int k = mergeStack.top; k >= 0; k--) {
                        if (mergeStack.arr[i] == newStack.arr[k]){
                            existingElement = true;
                            break;
                        }
                    }
                    if(!existingElement){
                        newStack.push(mergeStack.arr[i]);
                    }
                }
            }
        }
        newStack.display();
    }
    public static void main(String[] args) {
        WS23 obj1 = new WS23(5);
        System.out.println("Stack - 1:");
        obj1.push(1);
        obj1.push(1);
        obj1.push(6);
        obj1.push(6);
        obj1.push(5);
        obj1.display();

        System.out.println("Stack - 2:");
        WS23 obj2 = new WS23(4);
        obj2.push(5);
        obj2.push(2);
        obj2.push(2);
        obj2.push(5);
        obj2.display();

        System.out.println("Merged stack:");
        WS23 combinedStack = mergeStack(obj1, obj2);
        combinedStack.display();


        System.out.println("After removing duplicate elements: ");
        duplicateElements(mergeStack(obj1, obj2));
    }
}
