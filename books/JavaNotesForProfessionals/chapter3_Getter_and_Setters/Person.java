package books.JavaNotesForProfessionals.chapter3_Getter_and_Setters;

public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && name.length() > 2)
            this.name = name;
    }
}
