package ch11_Index;

public interface IndexInterface<T> {
    public T search(Comparable x);

    public void insert(Comparable x);
}
