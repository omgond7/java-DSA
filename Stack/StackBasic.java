package Stack;
class StackArray {
    int top;
    int[] arr;
    int maxCapacity;

    StackArray(int size) {
        this.maxCapacity = size;
        arr = new int[maxCapacity];
        top = -1;
    }
    
    public void push(int value){
        if(top == maxCapacity - 1) {
            throw new IndexOutOfBoundsException("Stack is full"); 
        }
        arr[++top] = value;
    }

    public int pop(){
        if(top == -1) {
            throw new IllegalStateException("Stack is already empty");
        }
        return arr[top--];
    }

    public void display(){
        if(top == -1){
            System.out.println("Stack is empty");
            return;
        }
        for(int i = top; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
   
    public int count() {
        return top + 1;
    }

    int search(int value) {
        for (int i = top; i >= 0; i--) {
            if (arr[i] == value) {
                return top - i + 1; 
            }
        }
        return -1;
    }
}

public class StackBasic {
    public static void main(String[] args) {
        StackArray stack = new StackArray(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.display();

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        stack.display();
    }
}