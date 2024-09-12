

class Odd extends Thread {
    public void run() {
        for (int i = 1; i < 10; i += 2) {
            try {
                Thread.sleep(500);  // Sleep for 500 ms
                System.out.println("Odd Thread: " + i + " - " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

//class Even implements Runnable {
//    public void run() {
//        for (int j = 0; j < 10; j += 2) {
//            try {
//                Thread.sleep(300);  // Sleep for 300 ms
//                System.out.println("Even Thread: " + j + " - " + Thread.currentThread().getName());
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}

public class ThreadClass {
    public static void main(String[] args) {
        Odd oddThread = new Odd();
        oddThread.start();

//        Even even = new Even();
//        Thread evenThread = new Thread(even);
//        evenThread.start();
    }
}