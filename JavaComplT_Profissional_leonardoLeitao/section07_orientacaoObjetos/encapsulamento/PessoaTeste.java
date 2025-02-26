package JavaComplT_Profissional_leonardoLeitao.section07_orientacaoObjetos.encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        //p1.idade = -30;
        p1.setIdade(78);

        System.out.println("idade da pessoa: " + p1.getIdade());
    }
}
