package AlgaworksBlack.logicaProgramacaoComJava.capitulo12_algoritmosAvancados;

public class AlgoritmoAvancado {
    public static void main(String[] args) {
        ListaAlunos lista = new ListaAlunos();

        Aluno aluno1 = new Aluno();
        aluno1.nome = "andre";
        lista.adicionar(aluno1);


        Aluno aluno2 = new Aluno();
        aluno2.nome = "andreia";
        lista.adicionar(aluno2);


        Aluno aluno3 = new Aluno();
        aluno3.nome = "alexandre";
        lista.adicionar(aluno3);


        Aluno aluno4 = new Aluno();
        aluno4.nome = "maria";
        lista.adicionar(aluno4);


        Aluno aluno5 = new Aluno();
        aluno5.nome = "joao";
        lista.adicionar(aluno5);


        Aluno aluno6 = new Aluno();
        aluno6.nome = "noe";
        lista.adicionar(aluno6);


        Aluno aluno7 = new Aluno();
        aluno7.nome = "ana";
        lista.adicionar(aluno7);


        Aluno aluno8 = new Aluno();
        aluno8.nome = "ana maria";
        lista.adicionar(aluno8);

        for (int i = 0; i < lista.tamanho(); i++) {
            Aluno a = lista.obter(i);
            System.out.println("Aluno: " + a.nome);
        }

        System.out.println("---------------");

        lista.remover(aluno3);

        for (int i = 0; i < lista.tamanho(); i++) {
            Aluno a = lista.obter(i);
            System.out.println("Aluno: " + a.nome);
        }
    }
}
