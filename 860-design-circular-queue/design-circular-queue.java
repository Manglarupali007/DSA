class MyCircularQueue {
int queue[];
int front, rear, SIZE;
    public MyCircularQueue(int k) {
        queue=new int[k];
        SIZE=k;
        front=-1;
        rear=-1;
    }
    
    public boolean enQueue(int value) {
        if((rear+1)%SIZE == front){
            return false;
        }
        if(front==-1){
            front=0;
        }
        rear=(rear+1)%SIZE;
queue[rear]=value;
return true;
    }
    
    public boolean deQueue() {
        if(front==-1){
            return false;
        }
        int result=queue[front];
        if(front==rear){
            front=-1;
            rear=-1;
        }
        else{
            front=(front+1)%SIZE;
        }
        return true;
    }
    
    public int Front() {
        if (front == -1) return -1;
        return queue[front];
    }
    
    public int Rear() {
        if (rear == -1) return -1;
        return queue[rear];
    }
    
    public boolean isEmpty() {
        return front == -1;
    }
    
    public boolean isFull() {
        return (rear + 1) % SIZE == front;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */