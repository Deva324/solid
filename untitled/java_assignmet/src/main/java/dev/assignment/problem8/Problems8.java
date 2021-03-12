package dev.assignment.problem8;

public class Problems8 {
    public static void main(String[] args) {
        try {
            throwException();
        } catch (CustomException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("In Finally Block");
        }
    }

    static void throwException() {
        try {
            throw new Custom3Exception("Custom Exception 3");
        } catch (Custom3Exception e) {
            throw new Custom2Exception("Custom Exception 2");
        } catch (Custom2Exception e) {
            throw new CustomException("Custom Exception");
        }
    }
}
