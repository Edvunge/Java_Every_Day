package JavaNotesForProfessionals.cap52_DefaultMethods.sect52_4AccessingOtherInterfaceMethods;

public interface CalculateSum {
    int getA();

    int getB();

    default int calculateSum() {
        return getA() + getB();
    }
}

