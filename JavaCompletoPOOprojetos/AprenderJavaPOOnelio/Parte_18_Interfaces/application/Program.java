package JavaCompletoPOOprojetos.AprenderJavaPOOnelio.Parte_18_Interfaces.application;

import JavaCompletoPOOprojetos.AprenderJavaPOOnelio.Parte_18_Interfaces.model.entities.CarRental;
import JavaCompletoPOOprojetos.AprenderJavaPOOnelio.Parte_18_Interfaces.model.entities.Vehicle;
import JavaNotesForProfessionals.cap_17_DaTeANDtime.DateTimeFormat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String carModel = sc.nextLine();
        System.out.println("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);

        //CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        sc.close();
    }
}