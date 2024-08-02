package JavaNotesForProfessionals.cap32_TreeMapANDtreeSet;

import java.util.Date;

public class Person implements Comparable<Person>{
    private  int id;
    private String firstName, lastName;
    private Date birthday;

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.id, o.id);
    }
}
