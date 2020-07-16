package ArrayIndexOutOfBoundsException;

public class ArrayIndexOutOfBoundsExceptions {

    public static void main(String[] args) {

        System.out.println("Hello");
        method();
        System.out.println("World");
    }

    public static void method() {
        int [] array = new int[2];
        array[0] = 1;
        array[1] = 2;

        try {
            System.out.println(array[2]);
        } catch (ArrayIndexOutOfBoundsExceptions ex) {
        }
        System.out.println(array[1]);
    }
}
