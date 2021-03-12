package dev.assignment.program7;

public class NestedClass {

    private class Class1 {

        private int data;

        public Class1(int data) {
            this.data = data;
        }
    }

    private class Class2 extends Class1 {
        public Class2() {
            super(1);
        }
    }
}
