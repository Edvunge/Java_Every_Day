package AulasDoYoutube.broCode.oop.javaCourse2023.part24_fileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("poem.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
