class Hi extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
    }
}

class hello extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
    }
}

public class first {
    public static void main(String[] args) {
        Hi obj1 = new Hi();
        hello obj2 = new hello();
        obj1.start();
        obj2.start();

    }
}
