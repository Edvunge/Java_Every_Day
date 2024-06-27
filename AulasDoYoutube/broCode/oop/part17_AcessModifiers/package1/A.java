package AulasDoYoutube.broCode.oop.part17_AcessModifiers.package1;

import AulasDoYoutube.broCode.oop.part17_AcessModifiers.package2.C;

public class A {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.publicMessage);
    }
}
