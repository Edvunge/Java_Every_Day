package JavaNotesForProfessionals.cap23_Arrays;

public class ArrayLength {
    public static void main(String[] args) {
        Integer arr[] = new Integer[] {1, 2, 3, null, 5, null, 7, null, null, null, 11, null, 13};

        int arrayLength = arr.length;
        int nonEmptyElemntsCount = 0;

        for (int i = 0; i < arrayLength; i++) {
            Integer arrElt = arr[i];
            if(arrElt != null) {
                nonEmptyElemntsCount++;
            }
        }

        System.out.println("Array 'arr' has a length of "+arrayLength+"\n"+"and it contains "+nonEmptyElemntsCount+" non-empty values");
    }
}
