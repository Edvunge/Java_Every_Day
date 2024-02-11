package Java_COMPLETO_POO_Projetos.AcademiaDevs.RewiesExtras;

public class ModificadoresDeAcesso {
    public static void main(String[] args) {
        // private
        // public
        // protected
        // default -> package -private -> pacote privado
        FestaVip festaVip = new FestaVip();
        festaVip.quantidadeCafe = 100;
        festaVip.beberCafe();
        System.out.println(festaVip.quantidadeCafe);
        festaVip.entrar();
    }
}
