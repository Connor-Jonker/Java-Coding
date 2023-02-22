public class TestQueue {

    private int cap = 8;
    private int data[];
    private int front = 0;
    private int rear = -1;
    private int size = 0;

    public TestQueue() {
        data = new int[this.cap];
    }
    public void enqueue(int v) {

        if (isQueueFull()) {
            System.out.println("Queue is full, increasing cap");
            increaseQueuecap();
        }
        rear++;
        if (rear >= data.length && size != data.length) {
            rear = 0;
        }
        data[rear] = v;
        size++;
        System.out.println("Adding: " + v);
    }
    public int dequeue() {
        int temp = 0;
        if (empty()) {
            System.out.println("The queue is empty");
        }
        front++;
        if (front > data.length - 1) {
            temp = data[front - 1];
            size--;
            front = 0;
            return temp;
        }
        temp = data[front - 1];
        size--;
        return temp;
    }
    public boolean empty() {
        boolean status = false;
        if (size == 0) {
            status = true;
        }
        return status;
    }
    public int getSize(){
        return this.size;
    }
    //Checks if the queue is full
    public boolean isQueueFull() {
        boolean status = false;
        if (size == data.length) {
            status = true;
        }
        return status;
    }
    //Increase the size of the queue
    private void increaseQueuecap() {
        int newcap = this.data.length * 2;
        int[] newArray = new int[newcap];
        int tempFront = front;
        int index = -1;
        while (true) {
            newArray[++index] = this.data[tempFront];
            tempFront++;
            if (tempFront == this.data.length) {
                tempFront = 0;
            }
            if (size == index + 1) {
                break;
            }
        }
        this.data = newArray;
        System.out.println("The new array capacity is: " + this.data.length);
        this.front = 0;
        this.rear = index;
    }

    public static void main(String a[]) {
//Adds numbers to the queue
        TestQueue queue = new TestQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
//Shows the current queue size
        System.out.println("The current size of Queue is: " + queue.getSize());
        System.out.println();
//Adds numbers to the queue
        queue.enqueue(9);
        queue.enqueue(10);
        queue.enqueue(11);
        queue.enqueue(12);
        queue.enqueue(13);
        queue.enqueue(14);
        queue.enqueue(15);
        queue.enqueue(16);
        queue.enqueue(17);
        queue.enqueue(18);
        queue.enqueue(19);
        queue.enqueue(20);
//Add more of these to remove more numbers from the queue
        System.out.println( "Removed: " +queue.dequeue());
        System.out.println( "Removed: " +queue.dequeue());
        System.out.println( "Removed: " +queue.dequeue());
//Shows the current queue size
        System.out.println("The current size of the Queue is: " + queue.getSize());
        System.out.println();
//Add more of these to remove more numbers from the queue
        System.out.println( "Removed: " +queue.dequeue());
        System.out.println( "Removed: " +queue.dequeue());
        System.out.println( "Removed: " +queue.dequeue());
        System.out.println( "Removed: " +queue.dequeue());
        System.out.println( "Removed: " +queue.dequeue());
        System.out.println( "Removed: " +queue.dequeue());
        System.out.println( "Removed: " +queue.dequeue());
        System.out.println( "Removed: " +queue.dequeue());


        System.out.println("The current size of the Queue is: " + queue.getSize());
        System.out.println();
    }
}