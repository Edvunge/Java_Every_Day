package w3schools.javaOOP.modifiers;

public class Second {
    public static void main(String[] args) {
        Student myObj = new Student();

        System.out.println("Name: " + myObj.fname);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Yer: " + myObj.graduationYear);
        myObj.study();
    }
}
