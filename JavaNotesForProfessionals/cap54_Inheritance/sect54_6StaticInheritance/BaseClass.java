package JavaNotesForProfessionals.cap54_Inheritance.sect54_6StaticInheritance;

import JavaNotesForProfessionals.cap54_Inheritance.sect54_6StaticInheritance.SubClass;

public class BaseClass  {
    public static int num = 5;

    public static void sayHello() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        BaseClass.sayHello();
        System.out.println("BaseClass's num: " + BaseClass.num);

        SubClass.sayHello();

        SubClass.sayHello(true);

        StaticOverride.sayHello();
        System.out.println("StaticOverride's num: " + StaticOverride.num);
    }
}
