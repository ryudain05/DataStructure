package ch9_Heap;

public interface PQInterface<E> {
    public void insert(E newItem) throws Exception;
    public E deleteMax() throws Exception;
    public E max() throws Exception;
    public boolean isEmpty();
    public void clear();
} // 코드 8-1
