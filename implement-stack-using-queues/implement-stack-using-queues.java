import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    //initialising a fresh queueu data structure using the java library 
    private Queue<Integer> queue;

    public MyStack() {
        //instantiating using the linked list
        queue = new LinkedList<>();
    }

    public void push(int x) {
        //first add the fresh element to the end of the queue
        int size = queue.size();
        queue.offer(x);

        // Rotate the queue to make the recently added element at the front
        for (int i = 0; i < size; i++) {
            int element = queue.poll();
            queue.offer(element);
        }
    }

    public int pop() {
        //easy
        return queue.poll();
    }

    public int top() {
        //easy
        return queue.peek();
    }

    public boolean empty() {
        //easy
        return queue.isEmpty();
    }
}
