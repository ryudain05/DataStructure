package ch6_Postfix.Queue;

public interface QueueInterface<E> {
    public void enqueue(E x);
    public E dequeue();
    public E front();
    public boolean isEmpty();
    public void dequeueAll();
    public void printAll();
}  // 코드 7-1


