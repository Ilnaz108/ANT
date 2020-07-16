package NullPointer;

class Class {
    public static void printString() {
        System.out.println("Hello World");
    }
}

public class Main {

    public void main(String[] args) {

        Class sc = null;

        sc.printString();

    }
}
