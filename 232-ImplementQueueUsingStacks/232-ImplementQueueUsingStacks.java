// Last updated: 7/28/2026, 5:10:26 PM
class MyQueue {
    Deque <Integer> queue;
    public MyQueue() {
        queue=new ArrayDeque<Integer>();
    }
    
    public void push(int x) {
        queue.offer(x);
    }
    
    public int pop() {
        for(int i=0;i<queue.size();i++)
        {
            queue.offer(queue.poll());
        }
        return queue.poll();
    }
    
    public int peek() {
        return queue.peek();
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */