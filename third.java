class thread1 extends Thread
{
    public void run()
    {
        int c=10/0;
    }
}
public class third {
    public static void main(String[] args) {
        thread1 th1=new thread1();
        //th1.start();//this will show exception in "Thread-0"Exception in thread "Thread-0" java.lang.ArithmeticException: / by zero
       // at thread1.run
       th1.run();//Exception in thread "main" java.lang.ArithmeticException: / by zero
        
    }
    
}
