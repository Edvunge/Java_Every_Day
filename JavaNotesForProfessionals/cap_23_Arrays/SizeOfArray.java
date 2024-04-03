package JavaNotesForProfessionals.cap_23_Arrays;

import java.util.Arrays;

public class SizeOfArray {
    public static void main(String[] args) {
        String[] listOfCities = new String[3];
        listOfCities[0] = "New York";
        listOfCities[1] = "London";
        listOfCities[2] = "Berlin";

        String[] newArray = Arrays.copyOf(listOfCities, listOfCities.length + 1);
        newArray[listOfCities.length] = "Sydney";
    }
}
