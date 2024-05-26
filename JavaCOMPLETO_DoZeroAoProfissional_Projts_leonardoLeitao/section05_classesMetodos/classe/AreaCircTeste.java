package JavaCOMPLETO_DoZeroAoProfissional_Projts_leonardoLeitao.section05_classesMetodos.classe;

public class AreaCircTeste {
    public static void main(String[] args) {
        AreaCirc a = new AreaCirc(10);
        a.pi = 10;
        System.out.println(a.area());


        AreaCirc a2 = new AreaCirc(5);
        a2.pi = 5;
        System.out.println(a2.area());
    }
}
