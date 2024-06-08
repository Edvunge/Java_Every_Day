package geeksForGeeks.JavaCourse.Parte_9_Multithreading;

public class ThreadApp {
    public static void main(String[] args) {
        int n = 8;

        for (int i = 0; i < n; i++) {
            ThreadTest object = new ThreadTest();
            object.run();
        }
    }
}
