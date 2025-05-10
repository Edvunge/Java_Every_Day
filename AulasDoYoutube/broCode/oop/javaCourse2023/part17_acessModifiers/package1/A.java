package AulasDoYoutube.broCode.oop.javaCourse2023.part17_acessModifiers.package1;

import AulasDoYoutube.broCode.oop.javaCourse2023.part17_acessModifiers.package2.C;

public class A {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.publicMessage);
    }
}
