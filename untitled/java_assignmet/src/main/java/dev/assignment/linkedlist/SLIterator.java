package dev.assignment.linkedlist;

public interface SLIterator<T> {
    boolean hasNext();
    T next();
    void add(T node);
    void remove(T node);
}
