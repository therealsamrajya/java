

class MyException extends Exception {
    public MyException() {
        super("Custom Exception Occurred");
    }

    public MyException(String message) {
        super(message);
    }
}

//class InvalidMarkException extends RuntimeException {
//    public InvalidMarkException() {
//        super("Custom Runtime Exception Occurred");
//    }
//
//    public InvalidMarkException(String message) {
//        super(message);
//    }
//}

public class Except {
    public static void main(String[] args) {
        try {
            throw new MyException(" custom checked exception message.");
        } catch (MyException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }


//        try {
//            throw new InvalidMarkException(" runtime exception message.");
//        } catch (InvalidMarkException e) {
//            System.out.println("Caught RuntimeException: " + e.getMessage());
//        }
    }
}