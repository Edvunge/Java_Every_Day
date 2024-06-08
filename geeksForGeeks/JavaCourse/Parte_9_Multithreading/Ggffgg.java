package geeksForGeeks.JavaCourse.Parte_9_Multithreading;

public class Ggffgg extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                sleep(5);
                System.out.println("Currently runnig - " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        // creating three threads
        Ggffgg t1 = new Ggffgg();
        Ggffgg t2 = new Ggffgg();
        Ggffgg t3 = new Ggffgg();

        // call run() method
        t1.start();
        t2.start();

        // call run() method
        t3.start();
    }
}
