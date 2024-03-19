package JavaProgrammingMasterclass.section_6_ControlFlow;

public class switchStatement {
    public static void main(String[] args) {
        int switchValue = 1;
        switch (switchValue) {
            case 1:
                System.out.println("value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            default:
                System.out.println("was not 1 or 2");
                break;
        }
    }
}
