package AulasDoYoutube.broCode.oop.javaCourse2023.part23_fileClass;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:/Documents/Java_Every_Day/AulasDoYoutube/broCode/oop/part23_fileClass/secret_message.txt");

        if (file.exists()) {
            System.out.println("That file exists! :o!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            System.out.println(file.isFile());
            file.delete();
        } else {
            System.out.println("That file doesn't exit :(");
        }
    }
}
