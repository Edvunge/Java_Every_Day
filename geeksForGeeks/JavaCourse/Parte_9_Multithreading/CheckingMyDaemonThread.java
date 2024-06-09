package geeksForGeeks.JavaCourse.Parte_9_Multithreading;

public class CheckingMyDaemonThread extends Thread {
    public void run()
    {

        // Checking whether the thread is daemon thread or
        // not
        if (Thread.currentThread().isDaemon()) {

            // Print statement when Daemon thread is called
            System.out.println(
                    "I am daemon thread and I am working");
        }

        else {

            // Print statement whenever users thread is
            // called
            System.out.println(
                    "I am user thread and I am working");
        }
    }
}
