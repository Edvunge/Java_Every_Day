package JavaNotesForProfessionals.cap_12_StringBuffer;

public class StringBufferClass {
    public static void main(String[] args) {
        /*
        Key Points:
            used to created mutable (modiﬁable) string.
            Mutable: Which can be changed.
            is thread-safe i.e. multiple threads cannot access it simultaneously.

        Methods:
            public synchronized StringBuﬀer append(String s)
            public synchronized StringBuﬀer insert(int oﬀset, String s)
            public synchronized StringBuﬀer replace(int startIndex, int endIndex, String str)
            public synchronized StringBuﬀer delete(int startIndex, int endIndex)
            public synchronized StringBuﬀer reverse()
            public int capacity()
            public void ensureCapacity(int minimumCapacity)
            public char charAt(int index)
            public int length()
            public String substring(int beginIndex)
            public String substring(int beginIndex, int endIndex)
        */
        String str = "study";
        str.concat("tonight");
        System.out.println(str);

        StringBuffer strB = new StringBuffer("study");
        strB.append(strB);
        System.out.println(strB);
    }
}
