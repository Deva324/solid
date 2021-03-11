package dev.assignment.singleton;

public class SingletonP {

    String test;

    /* Cannot access a non static member inside a static method*/
    static SingletonP init(String text) {
        // test =text;
        return new SingletonP();
    }

    public void print() {
        System.out.println(test);
    }
}
