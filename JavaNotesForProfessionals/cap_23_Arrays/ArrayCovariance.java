package JavaNotesForProfessionals.cap_23_Arrays;

import java.util.Arrays;
import java.util.List;

public class ArrayCovariance {
    public static void main(String[] args) {
        Integer[] integerArray = {1, 2, 3};
        Number[] numberArray = integerArray;
        Number firstElemnt = numberArray[0];
        numberArray[0] = 4L;

        List<Integer> integerList = Arrays.asList(1, 2, 3);
        List<? extends Number> numberList = integerList;
        Number firstEllement = numberList.get(0);
    }
}
