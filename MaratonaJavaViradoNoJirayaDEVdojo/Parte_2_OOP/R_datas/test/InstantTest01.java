package MaratonaJavaViradoNoJirayaDEVdojo.Parte_2_OOP.R_datas.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(LocalDateTime.now());
    }
}