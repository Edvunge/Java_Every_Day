package JavaNotesForProfessionals.cap_50_NestedAndInnerClasses.sect50_4_AnonymousInnerClasses;

public abstract class Comparator<S> {
    /*public static Comparator<S> CASE_INSENTIVE = new Comparator<String>() {
        @Override
        public int compare(String string1, String string2) {
            return string1.toUpperCase().compareTo(string2.toUpperCase());
        }
    };*/

    public abstract int compare(String string1, String string2);
}
