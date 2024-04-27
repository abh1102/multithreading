class thread extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);

        }
    }
}

public class second {

    public static void main(String[] args) {
        thread th1 = new thread();
        thread th2=new thread();
        th1.start();
        
        th2.start();

    }
}
