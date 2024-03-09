package JavaCompletoPOOprojetos.AcademiaDevs.Parte_12_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class NewArraylist {
    public static void main(String[] args) {
        ArrayList<String> filmes = new ArrayList<String>();
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(50);
        numeros.add(10);
        numeros.add(100);
        numeros.add(78);
        numeros.add(4);
        numeros.add(-32);
        numeros.add(4);
        numeros.add(8);

        // sort -> ordenar arraylist
        Collections.sort(numeros);

        // reverter a ordem
        Collections.sort(numeros, Collections.reverseOrder());

        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}
