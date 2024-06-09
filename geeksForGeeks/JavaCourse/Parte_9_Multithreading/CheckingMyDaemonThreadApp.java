package geeksForGeeks.JavaCourse.Parte_9_Multithreading;

public class CheckingMyDaemonThreadApp {
    public static void main(String[] args) {

        // Creating threads in the main body
        CheckingMyDaemonThread t1 = new CheckingMyDaemonThread();
        CheckingMyDaemonThread t2 = new CheckingMyDaemonThread();
        CheckingMyDaemonThread t3 = new CheckingMyDaemonThread();

        // Setting thread named 't2' as our Daemon thread
        t2.setDaemon(true);

        // Starting all 3 threads using start() method
        t1.start();
        t2.start();
        t3.start();

        // Now start() will automatically
        // invoke run() method
    }
}
