package JavaGuidesCourse.OOP.Part_1_Objects;

public class StudentApp {
    public static void main(String[] args) {
        try {
                String className = "net.javaguides.corejava.oops.Student";
                Class clasz = Class.forName(className);
                Student student = (Student) clasz.newInstance();
                System.out.println(student.getName());
                System.out.println(student.getCollege());
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
