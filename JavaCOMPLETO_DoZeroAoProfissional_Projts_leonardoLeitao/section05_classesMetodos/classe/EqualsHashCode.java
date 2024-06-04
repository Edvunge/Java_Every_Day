package JavaCOMPLETO_DoZeroAoProfissional_Projts_leonardoLeitao.section05_classesMetodos.classe;

public class EqualsHashCode {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Pedro Silva";
        u1.email = "pedro.silva@ezemail.com.br";

        Usuario u2 = new Usuario();
        u2.nome = "Paulo Silva";
        u2.email = "paulo.silva@ezemail.com.br";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));


        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
    }
}
