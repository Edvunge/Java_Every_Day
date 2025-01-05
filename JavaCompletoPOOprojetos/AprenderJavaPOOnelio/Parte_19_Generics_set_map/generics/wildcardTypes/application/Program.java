package JavaCompletoPOOprojetos.AprenderJavaPOOnelio.Parte_19_Generics_set_map.generics.wildcardTypes.application;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<?> myObjs = new ArrayList<Object>();
        List<Integer> myNumbers = new ArrayList<Integer>();
        myObjs = myNumbers;

        Object obj;
        Integer x = 10;
        obj = x;
    }
}
