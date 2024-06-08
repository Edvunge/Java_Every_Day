package geeksForGeeks.JavaCourse.Parte_9_Multithreading;

public class ThreadTest extends Thread {
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}
