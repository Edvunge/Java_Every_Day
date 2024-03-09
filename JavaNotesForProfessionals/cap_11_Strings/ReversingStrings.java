package JavaNotesForProfessionals.cap_11_Strings;

public class ReversingStrings {
    public static void main(String[] args) {
        // 1. StringBuilder/StringBuffer:

        String code = "codexString";
        System.out.println(code);

        StringBuilder sb = new StringBuilder(code);
        code = sb.reverse().toString();

        // 2. Char array:

        String code1 = "code";
        System.out.println(code1);

        char[] array = code1.toCharArray();
        for (int index = 0, mirroredIndex = array.length - 1; index < mirroredIndex; index++, mirroredIndex--) {
            char temp = array[index];
            array[index] = array[mirroredIndex];
            array[mirroredIndex] = temp;
        }

        // print reversed
        System.out.println(new String(array));
    }
}
