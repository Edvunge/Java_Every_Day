package JavaNotesForProfessionals.cap24_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemovingMatchingLists {
    public static void main(String[] args) {
        String[] names = {"james", "Smith", "Sonny", "Huckle", "Berry", "Finn", "Allan"};
        List<String> nameList = new ArrayList<>();


        // create a List from an Array
        nameList.addAll(Arrays.asList(names));

        String[] removeNmes = {"Sonny", "Huckle", "Berry"};
        List<String> removeNameList = new ArrayList<>();

        // create a list from an Array
        removeNameList.addAll(Arrays.asList(removeNmes));
    }
}
