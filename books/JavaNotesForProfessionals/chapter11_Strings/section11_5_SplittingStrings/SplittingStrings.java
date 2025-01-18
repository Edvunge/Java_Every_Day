package books.JavaNotesForProfessionals.chapter11_Strings.section11_5_SplittingStrings;

public class SplittingStrings {
    public static void main(String[] args) {
        String lineFromCsvFile = "Mickey;Bolton;12345;121216;";
        String[] dataCells = lineFromCsvFile.split(";");
        System.out.println(lineFromCsvFile);

        String lineFromInput = "What    do you need     from me?";
        String[] words = lineFromInput.split("\\s+");

        String[] firstNames = "Mickey, Frank, Alicia, Tom".split(", ");
    }
}
