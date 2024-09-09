package JavaNotesForProfessionals.cap56_Console_InputOutput.sect56_2AligningStrings;

public class RowsStrings {
    public static void main(String[] args) {
        String rowsStrings[] = new String[] { "1",
                                                "1234",
                                                "1234567",
                                                "123456789"};

        String column1Format = "%-3s";
        String column2Format = "%-5.8s";
        String column3Format = "%-6.6s";
        String formatInfo = column1Format + " " + column2Format + " " + column3Format;

        for(int i = 0; i < rowsStrings.length; i++) {
            System.out.format(formatInfo + rowsStrings[i] + rowsStrings[i] + rowsStrings[i]);
            System.out.println();
        }
    }
}
