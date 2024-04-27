//Implementation of thread classs
public class main extends Thread {
    public void run() {
        System.out.println("run ");
    }

    public static void main(String[] args) {
        main th = new main();
     
        th.start();
      //  System.out.println("thread start");
    }
}