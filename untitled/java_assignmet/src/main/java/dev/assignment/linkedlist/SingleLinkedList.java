package dev.assignment.linkedlist;

public class SingleLinkedList<T> {

    private int size = 0;
    private int cursor = 0;
    private Node<T> head;

    public int getSize() {
        return size;
    }

    IteratorImpl iterator() {
        return new IteratorImpl();
    }

    private class IteratorImpl implements SLIterator<T> {

        @Override
        public boolean hasNext() {
            return cursor < size;
        }

        @Override
        public T next() {
            T data = getNode(cursor);
            ++cursor;
            return data;
        }

        private T getNode(int index) {
            if (null == head) {
                throw new UnsupportedOperationException("List is empty!!");
            }
            if (index > size) {
                throw new UnsupportedOperationException("Index is bigger than size!!");
            }
            Node<T> temp = head;
            int i = 1;
            while (i <= index && null != temp) {
                temp = temp.next;
                i++;
            }
            return temp.data;
        }

        @Override
        public void add(T data) {
            Node<T> temp = new Node(data);
            if (null == head) {
                head = temp;
            } else {
                Node<T> temp1 = head;
                while (null != temp1.next) {
                    temp1 = temp1.next;
                }
                temp1.next = temp;
            }
            ++size;
        }

        @Override
        public void remove(T data) {
            if (size == 0 || null == head) {
                throw new UnsupportedOperationException("List is Empty");
            }
            Node<T> temp = head, prev = null;
            if (null != temp && temp.data == data) {
                head = temp.next;
                --size;
                --cursor;
                return;
            }
            while (null != temp && temp.data != data) {
                prev = temp;
                temp = temp.next;
            }
            if (null == temp)
                return;
            --size;
            --cursor;
            prev.next = temp.next;
        }
    }

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

}
