package Queue;

class Queue {
    int front;
    int rear;
    int capacity;
    int[] arr;
    Queue(int capacity) {
        this.capacity = capacity;
        front=-1;
        rear=-1;
    }
    public void enqueue(int value){
        if(rear==capacity -1 ){
            throw new IndexOutOfBoundsException("Queue is full");
        }
        arr[rear++]=value;
        return;
    }
    public int dequeue(){
        if(front > rear){
            throw new IllegalStateException("Queue is empty");
        }
        return arr[front++];
    }
    public int peek(){
        if(front > rear){
            throw new IllegalStateException("Queue is empty");
        }
        return arr[front];
    }
    public void display(){
        for(int i=front;i<=rear;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public int count() {
        return rear - front + 1;
    }
    public int search(int value) {
        for (int i = front; i <= rear; i++) {
            if (arr[i] == value) {
                return i - front + 1; 
            }
        }
        return -1;
    }
    public boolean isEmpty() {
        return front > rear;
    }
    public boolean isFull() {
        return rear == capacity - 1;
    }

}
public class QueueBasics {
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.display();

        System.out.println("Removed: " + q.dequeue());
        System.out.println("Removed: " + q.dequeue());

        q.display();

        System.out.println("Front element: " + q.peek());
        System.out.println("Count: " + q.count());
        System.out.println("Search 40: Position " + q.search(40));       
    }
}

