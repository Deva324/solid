package dev.assignment.linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        SingleLinkedList<String> sin = new SingleLinkedList<>();
        SLIterator<String> t = sin.iterator();
        t.add("Test");
        t.add("Test2");
        System.out.println(sin.getSize());
        while(t.hasNext()){
            System.out.println(t.next());
        }
        t.remove("Test");
        System.out.println(sin.getSize());
        while(t.hasNext()){
            System.out.println(t.next());
        }

    }
}
