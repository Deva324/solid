package dev.assignment.data;

public class Problem5 {
    int a;
    char c;

    void print() {
        System.out.println(a + " " + c);
    }
/*
This is not possible because the local variables are not initialized and local method variable inherently final.
    void printLocal() {
        int c;
        char d;
        System.out.println(c + " " + d);
    }*/
}
