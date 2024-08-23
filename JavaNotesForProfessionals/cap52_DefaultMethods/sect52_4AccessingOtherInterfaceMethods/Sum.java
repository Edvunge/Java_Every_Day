package JavaNotesForProfessionals.cap52_DefaultMethods.sect52_4AccessingOtherInterfaceMethods;

public class Sum implements CalculateSum {
    @Override
    public int getA() {
        return 1;
    }

    @Override
    public int getB() {
        return 2;
    }
}
