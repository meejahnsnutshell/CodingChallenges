package ExceptionHandling;

public class ExceptionDemo {

    public static void main(String[] args) {

        try {
            throwException();
        } catch (ArithmeticException e) {
            System.out.println("Catching " + e + " in the main method.");
        }


    }

    public static void throwException() throws ArithmeticException{

        try {
            System.out.println("Throwing an exception... ");
            throw new Exception();
        } catch (Exception e){
            System.out.println("Catching " + e + " in throwException.");
        }

        System.out.println("Throwing another exception..");
        throw new ArithmeticException();

    }
}
