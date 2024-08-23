package JavaNotesForProfessionals.cap52_DefaultMethods.sect52_4AccessingOtherInterfaceMethods;

public interface Summable {
    static int getA() {
        return 1;
    }

    static int getB() {
        return 2;
    }

    default int calculateSum() {
        return getA() + getB();
    }
}
