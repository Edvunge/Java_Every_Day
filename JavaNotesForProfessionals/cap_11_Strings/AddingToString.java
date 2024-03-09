package JavaNotesForProfessionals.cap_11_Strings;

public class AddingToString {
    public static class Person {
        String name;
        int age;

        public Person (int age, String name) {
            this.age = age;
            this.name = name;
        }

        public String toString() {
            return "My name is " + this.name + " and my age is " + this.age;
        }

    }



    public static void main(String[] args) {
        Person person = new Person(25, "Jonh");

        System.out.println(person.toString());
        System.out.println(person);
    }
}
