package EAD.Caelum;

public class TesteAdicionaPorPosicao {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();

        a1.setNome("Rafael");
        a2.setNome("Paulo");
        a3.setNome("Ana");

        Vetor lista = new Vetor();
        lista.adiciona(a);
        lista.adiciona(a);
        lista.adiciona(a);

        System.out.println(lista);
    }
}
