public class MySharedResource {
    private int value;

    public MySharedResource(int initialValue) {
        this.value = initialValue;
    }

    public synchronized int myReSource(boolean isWrite, int newValue) {
        if (isWrite) {
            System.out.println(Thread.currentThread().getName() + " is writing.");
            value = newValue;
            System.out.println(Thread.currentThread().getName() + " has written " + value);
        } else {
            System.out.println(Thread.currentThread().getName() + " is reading.");
            System.out.println(Thread.currentThread().getName() + " has read " + value);
        }
        return value;
    }

    public static void main(String[] args) {
        MySharedResource resource = new MySharedResource(0);

        // Create reader thread
        Thread reader = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                resource.myReSource(false, 0);
            }
        }, "Reader");

        // Create writer thread
        Thread writer = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                resource.myReSource(true, i * 10);
            }
        }, "Writer");

        reader.start();
        writer.start();
    }
}