package JavaNotesForProfessionals.cap23_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElementAnArrays {
    public static void main(String[] args) {
        String[] array = new String[] {"foo", "bar", "baz"};

        List<String> list = new ArrayList<>(Arrays.asList(array));
        list.remove("foo");

        array = list.toArray(new String[list.size()]);

        System.out.println(Arrays.toString(array));
    }
}
