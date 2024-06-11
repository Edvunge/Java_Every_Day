package AulasDoYoutube.learningLad.oopCourse.part01_classes_Objects_Methods;

public class Student {
    String name;
    int rollno;
    int age;

    public void introduce() {
        System.out.println("Hey i am " + name);
        System.out.println("My rollno is " + rollno);
        System.out.println("My age is " + age);
    }
}
